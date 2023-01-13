package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class News extends AppCompatActivity {

    RecyclerView recview1;
    ArrayList<NewsModel> datalist1;
    FirebaseFirestore db;
    myadapter1 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recview1 = (RecyclerView) findViewById(R.id.recview1);
        recview1.setLayoutManager(new LinearLayoutManager(this));
        datalist1 = new ArrayList<>();
        adapter1 = new myadapter1(datalist1);
        recview1.setAdapter(adapter1);

        db = FirebaseFirestore.getInstance();
        db.collection("News").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                        for (DocumentSnapshot d:list) {
                            NewsModel obj = d.toObject(NewsModel.class);
                            datalist1.add(obj);
                        }
                        adapter1.notifyDataSetChanged();
                    }
                });
    }
}