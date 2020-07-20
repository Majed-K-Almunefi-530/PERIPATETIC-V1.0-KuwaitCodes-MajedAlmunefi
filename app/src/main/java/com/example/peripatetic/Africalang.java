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

public class Africalang extends AppCompatActivity {

    TextToSpeech t1;


    EditText hello;
    CardView yes;
    TextView me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africalang);


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
                        Language.AFRIKAANS,
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










        //--------------------------------------------------------------------


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_recents:
                        Intent i = new Intent(Africalang.this,Africalang.class);
                        startActivity(i);
                        break;
                    case R.id.action_favorites:
                        Intent b = new Intent(Africalang.this,Africaembassy.class);
                        startActivity(b);
                        break;
                    case R.id.goback:
                        Intent c = new Intent(Africalang.this,Africainfoorbook.class);
                        startActivity(c);
                        break;
                    case R.id.action_nearby:
                        Intent d = new Intent(Africalang.this,Africamoneyconvert.class);
                        startActivity(d);
                        break;
                }
                return true;
            }
        });





    }
}