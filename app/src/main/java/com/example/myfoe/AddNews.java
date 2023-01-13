package com.example.myfoe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfoe.databinding.ActivityAddNewsBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class AddNews extends AppCompatActivity {

    ActivityAddNewsBinding binding;
    ProgressDialog progressDialog;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firebaseFirestore = FirebaseFirestore.getInstance();
        progressDialog = new ProgressDialog(this);

        binding.AddNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = binding.Title.getText().toString();
                String detail = binding.Detail.getText().toString();
                String date = binding.Date.getText().toString();
                String time = binding.Time.getText().toString();
                String venue = binding.Venue.getText().toString();

                if(title.isEmpty())
                {
                    binding.Title.setError("Field is Empty");
                    Toast.makeText(AddNews.this, "Please enter a title", Toast.LENGTH_SHORT).show();
                }
                else if(detail.isEmpty())
                {
                    binding.Detail.setError("Field is Empty");
                    Toast.makeText(AddNews.this, "Please enter a detail", Toast.LENGTH_SHORT).show();
                }
                else if(date.isEmpty())
                {
                    binding.Date.setError("Field is Empty");
                    Toast.makeText(AddNews.this, "Please enter a date", Toast.LENGTH_SHORT).show();
                }
                else if(time.isEmpty())
                {
                    binding.Time.setError("Field is Empty");
                    Toast.makeText(AddNews.this, "Please enter a time", Toast.LENGTH_SHORT).show();
                }
                else if(venue.isEmpty())
                {
                    binding.Venue.setError("Field is Empty");
                    Toast.makeText(AddNews.this, "Please enter a venue", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    progressDialog.show();

                    firebaseFirestore.collection("News")
                            .add(new NewsModel(title, detail, date, time, venue))
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                @Override
                                public void onSuccess(DocumentReference documentReference) {
                                    startActivity(new Intent(AddNews.this, News.class));
                                    Toast.makeText(AddNews.this, "Successfully Added New Announcement", Toast.LENGTH_SHORT).show();
                                    progressDialog.cancel();
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(AddNews.this, "Unsuccessfully", Toast.LENGTH_SHORT).show();
                                    progressDialog.cancel();
                                }
                            });
                }
            }
        });
    }
}