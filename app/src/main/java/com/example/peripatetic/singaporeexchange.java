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
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class singaporeexchange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singaporeexchange);

        final EditText kd = findViewById(R.id.kuwaitidinar);
        final TextView sd = findViewById(R.id.singadollar);
        CardView convert = findViewById(R.id.convert);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //
                //int in = Integer.valueOf(kd.getText().toString());
                double in = new Double(kd.getText().toString());


                double kdtosd = in * 4.53;
                sd.setText(kdtosd + "  S.D");
            }
        });


        //--------------------------------------------------------------

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(singaporeexchange.this,Languagessingapore.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(singaporeexchange.this,singaporeinfo.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(singaporeexchange.this,singaporecitychoose.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(singaporeexchange.this,singaporeexchange.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });
    }








    ///-------------------------------------------------------------------------



}