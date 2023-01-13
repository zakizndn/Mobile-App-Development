package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Professors extends AppCompatActivity {

    Button Prof28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professors);

        Prof28 = findViewById(R.id.Prof28);

        Prof28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Professors.this, Prof28.class);
                startActivity(intent);
            }
        });
    }
}