package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class orlandoinfoorbook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orlandoinfoorbook);

        CardView bookticket = findViewById(R.id.booktic);
        CardView info = findViewById(R.id.info);
        CardView home = findViewById(R.id.gohome);

        bookticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(orlandoinfoorbook.this,activitybookhotel.class);


                startActivity(i);


            }
        });


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(orlandoinfoorbook.this,Embassyorlando .class);
                startActivity(i);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(orlandoinfoorbook.this,aboutus .class);
                startActivity(i);

            }
        });


    }
}