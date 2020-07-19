package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Africachoosecity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africachoosecity);

        CardView nexttocape = findViewById(R.id.presstoviewcapetown);



        nexttocape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Africachoosecity.this,Africainfoorbook.class);
                startActivity(i);


            }
        });


    }
}