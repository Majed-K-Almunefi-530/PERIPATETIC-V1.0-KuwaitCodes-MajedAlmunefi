package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class contact_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        CardView call = findViewById(R.id.callus1);
        CardView mail = findViewById(R.id.mail1);
        CardView visit = findViewById(R.id.visitus);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+965 65066111";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myemail = "munefi04@gmail.com";
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


                Intent i = new Intent(contact_us.this,WebViewActivity.class);
                i.putExtra("data","https://goo.gl/maps/Nq6gPa3M4h2Z43Tr5");
                startActivity(i);

            }
        });


    }
}