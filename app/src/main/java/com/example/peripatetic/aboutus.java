package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class aboutus extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors =null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        SharedPreferences preferences = getApplication().getSharedPreferences("prefr", Context.MODE_PRIVATE);
        String user = preferences.getString("username","");

        final TextView hellouser = findViewById(R.id.hellouser);

        String hello = ("Hello " + user + " !");
        hellouser.setText(hello);



        models = new ArrayList<>();
        models.add(new Model(R.drawable.asia,"Asia","Asia is Earth's largest and most populous continent, located primarily in the Eastern and Northern Hemispheres."));
        models.add(new Model(R.drawable.amarica,"North Amarica","North America is a continent entirely within the Northern Hemisphere and almost all within the Western Hemisphere."));
        models.add(new Model(R.drawable.europe,"Europe","Europe is a continent located entirely in the Northern Hemisphere and mostly in the Eastern Hemisphere."));
        models.add(new Model(R.drawable.africa,"Africa","Africa is the world's second-largest and second-most populous continent, after Asia."));
        models.add(new Model(R.drawable.southamarica,"South Amarica","South America is a continent in the Western Hemisphere, mostly in the Southern Hemisphere."));
        models.add(new Model(R.drawable.oceania,"Oceania","Oceania is a geographic region that includes Australasia, Melanesia, Micronesia and Polynesia"));
        models.add(new Model(R.drawable.antartica,"Antartica","Antarctica, the southernmost continent and site of the South Pole, is a virtually uninhabited, ice-covered landmass."));
        models.add(new Model(R.drawable.usersettings,"Profile settings",""));


        adapter = new Adapter(models,this);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        final int num = 0 ;

        final Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color5),
                getResources().getColor(R.color.color6),
                getResources().getColor(R.color.color7),
                getResources().getColor(R.color.color8)

        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() -1) && position < (colors.length -1)){
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )

                    );


                }
                else {
                    viewPager.setBackgroundColor(colors[colors.length -1]);
                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        CardView contact = findViewById(R.id.contact);

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactusnext = new Intent(aboutus.this,contact_us.class);
                startActivity(contactusnext);
            }
        });









    }
}