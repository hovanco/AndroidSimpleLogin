package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtUser, edtPassword;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Tìm id của EditText user và password
        edtUser = findViewById(R.id.edt_user);
        edtPassword = findViewById(R.id.edt_password);


        btn = findViewById(R.id.btn_Login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy giá trị mà user nhập từ EditText user và password
                String user = edtUser.getText().toString();
                String password = edtPassword.getText().toString();

                if (user.equals("admin") && password.equals("admin")){
                    Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(LoginActivity.this, "Your Email or Password is incorrect", Toast.LENGTH_SHORT).show();
                }

//             Lỗi sai: Tìm hiểu lại == và equals
//                if (user =="admin" && password == "admin){
//                    Toast.makeText(LoginActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(LoginActivity.this, "Your Email or Password is incorrect", Toast.LENGTH_SHORT).show();
//                }

            }
        });

        btn = findViewById(R.id.btn_RegisterHere);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
