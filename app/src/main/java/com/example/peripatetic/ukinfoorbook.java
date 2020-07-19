package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ukinfoorbook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukinfoorbook);

        CardView bookticket = findViewById(R.id.bookticuk);
        CardView info = findViewById(R.id.infouk);
        CardView home = findViewById(R.id.gohomeuk);

        bookticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(ukinfoorbook.this,ukhotel.class);


                startActivity(i);


            }
        });


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ukinfoorbook.this,embassyuk .class);
                startActivity(i);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ukinfoorbook.this,aboutus .class);
                startActivity(i);

            }
        });



    }
}