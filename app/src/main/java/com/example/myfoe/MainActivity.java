package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button MemberSignIn, AdminSignIn, RegisterNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MemberSignIn = findViewById(R.id.MemberSignIn);
        AdminSignIn = findViewById(R.id.AdminSignIn);
        RegisterNow= findViewById(R.id.RegisterNow);

        MemberSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MemberSignIn.class);
                startActivity(intent);
            }
        });

        AdminSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminSignIn.class);
                startActivity(intent);
            }
        });

        RegisterNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterNow.class);
                startActivity(intent);
            }
        });

    }

}