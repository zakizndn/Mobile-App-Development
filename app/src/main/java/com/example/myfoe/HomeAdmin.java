package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeAdmin extends AppCompatActivity {

    Button MemberProfile, News, News1, Hotlines1, Staff1, Laboratory, FloorPlan1, Logout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);

        MemberProfile = findViewById(R.id.MemberProfile);
        News = findViewById(R.id.News);
        News1 = findViewById(R.id.News1);
        Hotlines1 = findViewById(R.id.Hotlines1);
        Staff1 = findViewById(R.id.Staff1);
        Laboratory = findViewById(R.id.Laboratory);
        FloorPlan1 = findViewById(R.id.FloorPlan1);
        Logout1 = findViewById(R.id.Logout1);

        MemberProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, MemberProfile.class);
                startActivity(intent);
            }
        });

        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, News.class);
                startActivity(intent);
            }
        });

        News1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, AddNews.class);
                startActivity(intent);
            }
        });

        Hotlines1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, Hotlines.class);
                startActivity(intent);
            }
        });

        Staff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, Staff.class);
                startActivity(intent);
            }
        });

        Laboratory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, Laboratory.class);
                startActivity(intent);
            }
        });

        FloorPlan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAdmin.this, FloorPlan.class);
                startActivity(intent);
            }
        });

        Logout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeAdmin.this, "Successful Logged Out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeAdmin.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}