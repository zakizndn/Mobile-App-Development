package com.example.myfoe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfoe.databinding.ActivityRegisterNowBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterNow extends AppCompatActivity {

    ActivityRegisterNowBinding binding;
    ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterNowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        progressDialog = new ProgressDialog(this);

        binding.SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = binding.StudentID.getText().toString();
                String name = binding.FullName.getText().toString();
                String email = binding.Email.getText().toString().trim();
                String password = binding.Password.getText().toString();

                if(id.isEmpty())
                {
                    binding.StudentID.setError("Field is Empty");
                    Toast.makeText(RegisterNow.this, "Please enter your student ID", Toast.LENGTH_SHORT).show();
                }
                else if(name.isEmpty())
                {
                    binding.FullName.setError("Field is Empty");
                    Toast.makeText(RegisterNow.this, "Please enter your full name", Toast.LENGTH_SHORT).show();
                }
                else if(email.isEmpty())
                {
                    binding.Email.setError("Field is Empty");
                    Toast.makeText(RegisterNow.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(password.isEmpty())
                {
                    binding.FullName.setError("Field is Empty");
                    Toast.makeText(RegisterNow.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                }
                else {
                    progressDialog.show();

                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                            .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                @Override
                                public void onSuccess(AuthResult authResult) {
                                    startActivity(new Intent(RegisterNow.this, MainActivity.class));
                                    Toast.makeText(RegisterNow.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                    progressDialog.cancel();

                                    firebaseFirestore.collection("Users")
                                            .document(FirebaseAuth.getInstance().getUid())
                                            .set(new UserModel(id, name, email, password));
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(RegisterNow.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                    progressDialog.cancel();
                                }
                            });
                }
            }
        });
    }
}