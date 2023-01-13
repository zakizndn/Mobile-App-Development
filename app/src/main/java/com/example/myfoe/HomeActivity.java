package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button Profile, News, Hotlines, Staff, Laboratory, FloorPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Profile = findViewById(R.id.Profile);
        News = findViewById(R.id.News);
        Hotlines = findViewById(R.id.Hotlines);
        Staff = findViewById(R.id.Staff);
        Laboratory = findViewById(R.id.Laboratory);
        FloorPlan = findViewById(R.id.FloorPlan);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Profile.class);
                startActivity(intent);
            }
        });

        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, News.class);
                startActivity(intent);
            }
        });

        Hotlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Hotlines.class);
                startActivity(intent);
            }
        });

        Staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Staff.class);
                startActivity(intent);
            }
        });

        Laboratory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Laboratory.class);
                startActivity(intent);
            }
        });

        FloorPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FloorPlan.class);
                startActivity(intent);
            }
        });
    }
}