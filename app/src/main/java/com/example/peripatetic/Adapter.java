package com.example.peripatetic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class Adapter extends PagerAdapter {

    private List<Model> models;

    private LayoutInflater layoutInflater;

    private Context context;





    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.continent1 , container , false);
        ImageView imageView;
        final TextView titles, desc;

        imageView = view.findViewById(R.id.image);
        titles = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);



        imageView.setImageResource(models.get(position).getImage());
        titles.setText(models.get(position).getName());
        desc.setText(models.get(position).getDesc());

        final String continent = (titles +" ");
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent a = new Intent(context,AsiaCountry.class);
                    context.startActivity(a);
                }
                else if (position == 1) {
                    Intent b = new Intent(context,Northamaricachoosecountry.class);
                    context.startActivity(b);
                }
                else if (position == 2) {
                    Intent c = new Intent(context,eorpoecountry.class);
                    context.startActivity(c);
                }
                else if (position == 3) {
                    Intent d = new Intent(context,ChooseinAfarica.class);
                    context.startActivity(d);
                }
                else if (position == 4) {
                    Toast.makeText(context.getApplicationContext(),"COMING SOON!",Toast.LENGTH_LONG).show();

                }
                else if (position == 5) {
                    Intent f = new Intent(context,Austrailia.class);
                    context.startActivity(f);
                }
                else if (position == 6) {
                    Toast.makeText(context.getApplicationContext(),"No countries available",Toast.LENGTH_LONG).show();
                    //Toast.makeText(getApp(),"please enter a valid number",Toast.LENGTH_SHORT).show();

                }
                else if (position == 7) {
                    Intent h = new Intent(context,Name_page.class);
                    context.startActivity(h);
                }
            }
        });


        container.addView(view,0);


        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
