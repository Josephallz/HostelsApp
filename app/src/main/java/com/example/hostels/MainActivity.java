package com.example.hostels;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hostels.DBHelper;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {
    EditText usernameHO,passwordHO;
    Button SignupHO, SigninHO;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameHO=findViewById(R.id.username);
        usernameHO.setTextColor(Color.BLACK);
        passwordHO=findViewById(R.id.password);
        passwordHO.setTextColor(Color.BLACK);
        SignupHO=findViewById(R.id.signup);
        SigninHO=findViewById(R.id.signin);
        DB= new DBHelper(this);

        SignupHO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user= usernameHO.getText().toString();
                String pass= passwordHO.getText().toString();


                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)
                )
                    Toast.makeText(MainActivity.this," Please Enter the Username and Password ",Toast.LENGTH_SHORT).show();
                else {


                    {

                        Boolean cheackuser = DB.checkUsername(user);
                        if(cheackuser==false){

                            Boolean insert = DB.insertData(user,pass);
                            if(insert==true){

                                Toast.makeText(MainActivity.this,"You Registered Successfully",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),HomePage.class);

                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(MainActivity.this,"The Registeration Failed ", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(MainActivity.this,"The User is already Exists!!!",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
        SigninHO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),loginpage.class);
                startActivity(intent);

            }
        });


    }
}