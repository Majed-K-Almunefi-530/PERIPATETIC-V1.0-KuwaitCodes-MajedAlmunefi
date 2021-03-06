package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class eorpoecountry extends AppCompatActivity {
    ViewPager viewPager;
    europeAdapter myadapter;
    List<Model> ukmodels;
    Integer[] colors =null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private Object asiaCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eorpoecountry);





        ukmodels = new ArrayList<>();
        ukmodels.add(new Model(R.drawable.uk,"United Kingdom","The United Kingdom, made up of England, Scotland, Wales and Northern Ireland"));
        ukmodels.add(new Model(R.drawable.spain,"Spain","Spain, a country on Europe’s Iberian Peninsula, includes 17 autonomous regions with diverse geography and cultures."));
        /*models.add(new Model(R.drawable.europe,"Europe","Europe is a continent located entirely in the Northern Hemisphere and mostly in the Eastern Hemisphere."));
        models.add(new Model(R.drawable.africa,"Africa","Africa is the world's second-largest and second-most populous continent, after Asia."));
        models.add(new Model(R.drawable.southamarica,"South Amarica","South America is a continent in the Western Hemisphere, mostly in the Southern Hemisphere."));
        models.add(new Model(R.drawable.oceania,"Oceania","Oceania is a geographic region that includes Australasia, Melanesia, Micronesia and Polynesia"));
        models.add(new Model(R.drawable.antartica,"Antartica","Antarctica, the southernmost continent and site of the South Pole, is a virtually uninhabited, ice-covered landmass."));
        models.add(new Model(R.drawable.usersettings,"Profile settings",""));*/


        //myadapter = new Adapter(models,this);
        myadapter = new europeAdapter(ukmodels,this);

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(myadapter);
        viewPager.setPadding(130,0,130,0);

        final int num = 0 ;

        final Integer[] colors_temp = {
                getResources().getColor(R.color.color4),
                getResources().getColor(R.color.color1),
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