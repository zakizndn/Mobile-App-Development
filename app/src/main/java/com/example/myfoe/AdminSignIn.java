package com.example.myfoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminSignIn extends AppCompatActivity {

    Button Login1;
    EditText AdminID, AdminPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_sign_in);

        Login1 = findViewById(R.id.Login1);
        AdminID = findViewById(R.id.AdminID);
        AdminPassword = findViewById(R.id.AdminPassword);

        Login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = AdminID.getText().toString().trim();
                String password = AdminPassword.getText().toString().trim();

                if(email.equals("MMUAdmin100") && password.equals("123456789")) {
                    Toast.makeText(AdminSignIn.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AdminSignIn.this, HomeAdmin.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(AdminSignIn.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}