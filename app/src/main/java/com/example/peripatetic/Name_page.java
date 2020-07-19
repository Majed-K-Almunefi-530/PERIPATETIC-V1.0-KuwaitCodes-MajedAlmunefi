package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Name_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_page);

        final EditText username = findViewById(R.id.username);

        TextView next = findViewById(R.id.nextpagesubmit);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences =Name_page.this.getSharedPreferences("prefr", Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putString("username",username.getText().toString());
                edit.commit();


                SharedPreferences preferences1 = getApplication().getSharedPreferences("prefr", Context.MODE_PRIVATE);
                String user = preferences1.getString("username","");




                Intent i = new Intent(Name_page.this,aboutus.class);
                startActivity(i);
            }
        });




    }
}