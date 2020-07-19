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

public class AusConvert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aus_convert);





        final EditText kd = findViewById(R.id.kuwaitidinar);
        final TextView sd = findViewById(R.id.singadollar);
        CardView convert = findViewById(R.id.convert);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                //int in = Integer.valueOf(kd.getText().toString());
                double in = new Double(kd.getText().toString());


                double kdtosd = in * 4.65;
                sd.setText(kdtosd + "  AUD");
            }
        });


        //--------------------------------------------------------------

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(AusConvert.this,AusLang.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(AusConvert.this,Ausembassy.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(AusConvert.this,Ausinfoorbook.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(AusConvert.this,AusConvert.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });










    }
}