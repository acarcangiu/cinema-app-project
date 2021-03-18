package com.example.cinemaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button Login;
    EditText Email;
    EditText Password;
    Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login = findViewById(R.id.loginButton);
        Register = findViewById(R.id.Register);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);





        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    openMainActivity();
                }






        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });

    }
    public void openMainActivity() {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    public void openRegisterActivity() {
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivity(intent);

    }
}