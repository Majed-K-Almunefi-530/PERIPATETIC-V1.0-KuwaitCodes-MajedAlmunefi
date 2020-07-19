package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AusChooseCity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aus_choose_city);


        CardView nexttocape = findViewById(R.id.presstoviewsydney);



        nexttocape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(AusChooseCity.this,Ausinfoorbook.class);
                startActivity(i);


            }
        });



    }
}