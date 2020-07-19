package com.example.peripatetic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class singaporeinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singaporeinfo);



        CardView call = findViewById(R.id.callembassy);
        CardView mail = findViewById(R.id.mailembassy);
        CardView visit = findViewById(R.id.visitembassy);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+65 6804 9550";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myemail = "singapore@mfa.gov.kw";
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

                Intent i = new Intent(singaporeinfo.this,WebViewActivity.class);
                i.putExtra("data","https://goo.gl/maps/8A11LxgXaV9kF7t69");
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
                        Intent i = new Intent(singaporeinfo.this,Languagessingapore.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(singaporeinfo.this,singaporeinfo.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(singaporeinfo.this,singaporecitychoose.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(singaporeinfo.this,singaporeexchange.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });


    }
}