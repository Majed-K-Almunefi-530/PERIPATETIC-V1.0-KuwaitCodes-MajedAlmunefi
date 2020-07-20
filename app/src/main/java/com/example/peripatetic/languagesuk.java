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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mannan.translateapi.Language;
import com.mannan.translateapi.TranslateAPI;

import java.util.Locale;

public class languagesuk extends AppCompatActivity {




    TextToSpeech t1;


    EditText hello;
    CardView yes;
    TextView me;

    CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;
    CardView c5;
    CardView c6;




    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_languagesuk);

        c1=(CardView)findViewById(R.id.hello);
        c2=(CardView)findViewById(R.id.howmuch);
        c3=(CardView)findViewById(R.id.whereisthe__);
        c4=(CardView)findViewById(R.id.goodmor);
        c5=(CardView)findViewById(R.id.please);
        c6=(CardView)findViewById(R.id.thankyou);


            hello = findViewById(R.id.edite);
            yes =findViewById(R.id.button);
            me = findViewById(R.id.res);

            t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if(status != TextToSpeech.ERROR) {
                        t1.setLanguage(Locale.UK);
                    }
                }
            });

            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TranslateAPI translateAPI= new TranslateAPI(
                            Language.AUTO_DETECT,
                            Language.ENGLISH,
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
                String toSpeak = "how much";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "where is";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "good morning";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Please";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Thank you";
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
                            Intent i = new Intent(languagesuk.this,languagesuk.class);
                            startActivity(i);
                            break;
                        case R.id.action_favorites:
                            Intent b = new Intent(languagesuk.this,embassyuk.class);
                            startActivity(b);
                            break;
                        case R.id.goback:
                            Intent c = new Intent(languagesuk.this,ukinfoorbook.class);
                            startActivity(c);
                            break;
                        case R.id.action_nearby:
                            Intent d = new Intent(languagesuk.this,convertmoneyuk.class);
                            startActivity(d);
                            break;
                    }
                    return true;
                }
            });











        }
}