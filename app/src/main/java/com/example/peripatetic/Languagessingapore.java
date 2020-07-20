package com.example.peripatetic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mannan.translateapi.Language;
import com.mannan.translateapi.TranslateAPI;

import java.util.Locale;

public class Languagessingapore extends AppCompatActivity {

    TextToSpeech t1;


    EditText hello;
    CardView yes;
    TextView me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languagessingapore);


        hello = findViewById(R.id.edite);
        yes =findViewById(R.id.button);
        me = findViewById(R.id.res);

        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TranslateAPI translateAPI= new TranslateAPI(
                        Language.AUTO_DETECT,
                        Language.MALAY,
                        hello.getText().toString()
                );

                translateAPI.setTranslateListener(new TranslateAPI.TranslateListener() {
                    @Override
                    public void onSuccess(String s) {
                        String tag = "tag";
                        Log.d(tag,"onSucces" + s);
                        me.setText(s);

                        String toSpeak = me.getText().toString();
                        Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                        t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                    }

                    @Override
                    public void onFailure(String ErroroText) {
                        String tag= "tag";
                        Log.d(tag,"onfailure" + ErroroText);
                    }
                });





            }
        });





        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(Languagessingapore.this,Languagessingapore.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(Languagessingapore.this,singaporeinfo.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(Languagessingapore.this,singaporecitychoose.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(Languagessingapore.this,singaporeexchange.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });






        /*c1=(CardView)findViewById(R.id.hello);
        c2=(CardView)findViewById(R.id.howmuch);
        c3=(CardView)findViewById(R.id.whereisthe__);
        c4=(CardView)findViewById(R.id.goodmor);
        c5=(CardView)findViewById(R.id.please);
        c6=(CardView)findViewById(R.id.thankyou);



        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "hello";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "berapa banyak";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "di manakah";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "selamat Pagi";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Tolonglah";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "terima kasih";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });



        //--------------------------------------------------------------------

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(Languagessingapore.this,Languagessingapore.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(Languagessingapore.this,singaporeinfo.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(Languagessingapore.this,singaporecitychoose.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(Languagessingapore.this,singaporeexchange.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });*/









    }

    //public void onPause(){
       // if(t1 !=null){
         //   t1.stop();
         //   t1.shutdown();
      //  }
       // super.onPause();
    //}
}
