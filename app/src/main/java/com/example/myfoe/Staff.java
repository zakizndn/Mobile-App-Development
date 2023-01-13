package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staff extends AppCompatActivity {

    Button Admin, Prof, SeniorLec, Lec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        Admin = findViewById(R.id.Admin);
        Prof = findViewById(R.id.Prof);
        SeniorLec = findViewById(R.id.SeniorLec);
        Lec = findViewById(R.id.Lec);

        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Staff.this, Administration.class);
                startActivity(intent);
            }
        });

        Prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Staff.this, Professors.class);
                startActivity(intent);
            }
        });

        SeniorLec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Staff.this, SeniorLec.class);
                startActivity(intent);
            }
        });

        Lec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Staff.this, Lecturers.class);
                startActivity(intent);
            }
        });
    }
}