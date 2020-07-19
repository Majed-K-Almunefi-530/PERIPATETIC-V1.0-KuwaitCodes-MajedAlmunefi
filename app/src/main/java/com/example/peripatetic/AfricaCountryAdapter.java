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

public class AfricaCountryAdapter extends PagerAdapter {



    private List<Model> mymodels;

    private LayoutInflater layoutInflater;

    private Context context;





    public AfricaCountryAdapter(List<Model> models, Context context) {
        this.mymodels = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mymodels.size();
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



        imageView.setImageResource(mymodels.get(position).getImage());
        titles.setText(mymodels.get(position).getName());
        desc.setText(mymodels.get(position).getDesc());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){
                    Intent a = new Intent(context,Africachoosecity.class);
                    context.startActivity(a);
                }
                else if (position == 1) {
                    Toast.makeText(context.getApplicationContext(),"COMING SOON!",Toast.LENGTH_LONG).show();

                }
                else if (position == 2) {
                    Intent c = new Intent(context,contact_us.class);
                    context.startActivity(c);
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
