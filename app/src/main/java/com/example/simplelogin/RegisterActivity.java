package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView textView = findViewById(R.id.text_title_register);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });




        String email = getIntent().getStringExtra("User");
        String password = getIntent().getStringExtra("PASSWORD");
        String confirmpassword = getIntent().getStringExtra("Confirm PASSWORD");


        TextView textViewEmail = findViewById(R.id.register_user);
        TextView textViewPassword = findViewById(R.id.register_password);
        TextView textViewConfirmPassword = findViewById(R.id.register_confirm_password);

        textViewEmail.setText(email);
        textViewPassword.setText(password);
        textViewConfirmPassword.setText(confirmpassword);


        button = findViewById(R.id.btn_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.btn_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });




    }
}
