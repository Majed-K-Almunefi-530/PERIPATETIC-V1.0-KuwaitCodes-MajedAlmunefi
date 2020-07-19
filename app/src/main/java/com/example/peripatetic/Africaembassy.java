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

public class Africaembassy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africaembassy);







        CardView call = findViewById(R.id.callembassy);
        CardView mail = findViewById(R.id.mailembassy);
        CardView visit = findViewById(R.id.visitembassy);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+27 012 342 0877";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myemail = "info@kuwaitembassy.co.za";
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


                Intent i = new Intent(Africaembassy.this,WebViewActivity.class);
                i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/890+Arcadia+Street,+Arcadia,+Pretoria,+South+Africa/@2.814597,12.1412552,4z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1e9561eb5b4db9ed:0xba6b77ff50ed321d!2m2!1d28.2241135!2d-25.7479816?hl=en");
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
                        Intent i = new Intent(Africaembassy.this,Africalang.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(Africaembassy.this,Africaembassy.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(Africaembassy.this,Africainfoorbook.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(Africaembassy.this,Africamoneyconvert.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });







    }
}