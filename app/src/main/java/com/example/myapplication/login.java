package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if(username.equals("admin") && password.equals("admin")){
                    Toast.makeText(login.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                } else
                {
                    Toast.makeText(login.this, "Login Failed !!!", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}