package com.example.hostels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {

    EditText username,password;
    Button signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        username=findViewById(R.id.username1);
        username.setTextColor(Color.BLACK);
        password=findViewById(R.id.password1);
        password.setTextColor(Color.BLACK);
        signin=findViewById(R.id.signin1);
        DB= new DBHelper(this);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                    Toast.makeText(loginpage.this, "Dear,All fields required", Toast.LENGTH_SHORT).show();
                else {

                    Boolean checkuserpass = DB.checkUsername(user, pass);
                    if (checkuserpass == true) {
                        Toast.makeText(loginpage.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),HomePage.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(loginpage.this, "Login Failed", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

    }
}