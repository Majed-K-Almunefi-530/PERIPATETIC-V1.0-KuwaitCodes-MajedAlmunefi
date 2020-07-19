package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Northamaricachoosecountry extends AppCompatActivity {

    ViewPager viewPager;
    NorthamaricaAdapter myadapter;
    List<Model> mymodels;
    Integer[] colors =null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northamaricachoosecountry);






        mymodels = new ArrayList<>();
        mymodels.add(new Model(R.drawable.usa,"USA","The U.S. is a country of 50 states covering a vast swath of North America."));
        mymodels.add(new Model(R.drawable.canada,"Canada","Canada is a country in the northern part of NA. Its 10 provinces and 3 territories."));



        //myadapter = new Adapter(models,this);
        //myadapter = new NorthamaricaAdapter(mymodels,this);
        myadapter = new NorthamaricaAdapter(mymodels,this);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(myadapter);
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
                if (position < (myadapter.getCount() -1) && position < (colors.length -1)){
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







    }
}