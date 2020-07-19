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

public class Embassyorlando extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embassyorlando);





        CardView call = findViewById(R.id.callembassy);
        CardView mail = findViewById(R.id.mailembassy);
        CardView visit = findViewById(R.id.visitembassy);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+1 917 2744499";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myemail = " kuwaitconsulateny@gmail.com";
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
                Intent i = new Intent(Embassyorlando.this,WebViewActivity.class);
                i.putExtra("data","https://goo.gl/maps/sNdL677DCiXmrRxx6");
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
                        Intent i = new Intent(Embassyorlando.this,Langorlando.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(Embassyorlando.this,Embassyorlando.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(Embassyorlando.this,orlandoinfoorbook.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(Embassyorlando.this,convertmoneyorlando.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });





    }
}
