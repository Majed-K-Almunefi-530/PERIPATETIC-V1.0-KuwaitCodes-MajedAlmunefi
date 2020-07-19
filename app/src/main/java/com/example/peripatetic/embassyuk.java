package com.example.peripatetic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class embassyuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embassyuk);




        CardView call = findViewById(R.id.callembassy);
        CardView mail = findViewById(R.id.mailembassy);
        CardView visit = findViewById(R.id.visitembassy);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+44 20 8992 2053";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myemail = "kuwaiti@dircon.uk";
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.setType("message/rfc822");
                mail.putExtra(Intent.EXTRA_EMAIL,new String[]{myemail});
                mail.setPackage("com.google.android.gm");
                startActivity(mail);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(embassyuk.this,WebViewActivity.class);
                i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/Kuwait+Cultural+Office+London,+Knightsbridge,+London,+UK/@38.9978546,5.9065742,4z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48760539863b14ed:0x584a0088f9a8ff43!2m2!1d-0.1586954!2d51.5024456?hl=en");
                startActivity(i);
            }
        });



//----------------------------------------------------------------

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(embassyuk.this,languagesuk.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(embassyuk.this,embassyuk.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(embassyuk.this,ukinfoorbook.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(embassyuk.this,convertmoneyuk.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });





    }
}