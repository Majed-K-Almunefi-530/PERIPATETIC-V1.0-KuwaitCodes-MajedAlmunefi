package com.example.peripatetic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class convertmoneyuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertmoneyuk);



        final EditText kd = findViewById(R.id.kuwaitidinar);
        final TextView sd = findViewById(R.id.singadollar);
        CardView convert = findViewById(R.id.convert);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                //int in = Integer.valueOf(kd.getText().toString());
                double in = new Double(kd.getText().toString());


                double kdtosd = in * 2.59;
                sd.setText(kdtosd + "  P.S");
            }
        });


        //--------------------------------------------------------------

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(convertmoneyuk.this,languagesuk.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(convertmoneyuk.this,embassyuk.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(convertmoneyuk.this,ukinfoorbook.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(convertmoneyuk.this,convertmoneyuk.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });




    }
}