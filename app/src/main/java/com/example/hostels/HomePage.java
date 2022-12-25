package com.example.hostels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    public CardView cav1,cav2,cav3,cav4,cav5,cav6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        cav1 = (CardView) findViewById(R.id.card1);
        cav1.setCardBackgroundColor(Color.WHITE);

        cav2 = (CardView) findViewById(R.id.card2);
        cav2.setCardBackgroundColor(Color.WHITE);

        cav3 = (CardView) findViewById(R.id.card3);
        cav3.setCardBackgroundColor(Color.WHITE);

        cav4 = (CardView) findViewById(R.id.card4);
        cav4.setCardBackgroundColor(Color.WHITE);

        cav5 = (CardView) findViewById(R.id.card5);
        cav5.setCardBackgroundColor(Color.WHITE);

        cav6 = (CardView) findViewById(R.id.card6);
        cav6.setCardBackgroundColor(Color.WHITE);





        cav1.setOnClickListener(this);
        cav2.setOnClickListener(this);
        cav3.setOnClickListener(this);
        cav4.setOnClickListener(this);
        cav5.setOnClickListener(this);
        cav6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.card1:
                i = new Intent(this,paymentpage.class);
                startActivity(i);
                break;

            case R.id.card2:
                i = new Intent(this,paymentpage.class);
                startActivity(i);
                break;

            case R.id.card3:
                i = new Intent(this,paymentpage.class);
                startActivity(i);
                break;

            case R.id.card4:
                i = new Intent(this,paymentpage.class);
                startActivity(i);
                break;

            case R.id.card5:
                i = new Intent(this,paymentpage.class);
                startActivity(i);
                break;

            case R.id.card6:
                i = new Intent(this,paymentpage.class);
                startActivity(i);
                break;


        }
    }
}