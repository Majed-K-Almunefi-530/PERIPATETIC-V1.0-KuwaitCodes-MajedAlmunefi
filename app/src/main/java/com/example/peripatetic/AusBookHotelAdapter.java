package com.example.peripatetic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AusBookHotelAdapter extends RecyclerView.Adapter {


    ArrayList<book> bArray;
    Context c;

    public AusBookHotelAdapter(ArrayList<book> bArray, Context c) {
        this.bArray = bArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookinsingapore,parent,false);
        ViewHolder vh =new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        ((ViewHolder) holder).img.setImageResource(bArray.get(position).getImagelogo());
        ((ViewHolder) holder).web.setImageResource(bArray.get(position).getImageweb());
        ((ViewHolder) holder).loco.setImageResource(bArray.get(position).getImageloco());
        ((ViewHolder) holder).title.setText(bArray.get(position).getTitle());
        ((ViewHolder) holder).web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.shangri-la.com/sydney/shangrila/");
                    c.startActivity(i);

                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.ihg.com/intercontinental/hotels/gb/en/sydney/sydic/hoteldetail?cm_mmc=GoogleMaps-_-IC-_-AU-_-SYDIC");
                    c.startActivity(i);



                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www3.hilton.com/en/hotels/new-south-wales/hilton-sydney-SYDHITW/index.html?WT.mc_id=zELWAKN0APAC1HI2DMH3LocalSearch4DGGenericx6SYDHITW");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//shangrila+sydney/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x6b12ae43b99a25b3:0x703964d0a01e2497?sa=X&ved=2ahUKEwj9n8DGg9jqAhUI8BoKHdn-AcIQ9RcwDXoECBgQEA");
                    c.startActivity(i);




                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/intercontinental+sydney+double+bay/@-0.1456126,13.2862791,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x6b12addd72436055:0x48d0de4aa829daea!2m2!1d151.2432424!2d-33.8761735?hl=en");
                    c.startActivity(i);


                }
                else if (position == 2){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/hilton+sydney/@-0.1454724,13.2686663,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x6b12ae3ef48720f1:0xe4cb86124df9b798!2m2!1d151.2080057!2d-33.8718021?hl=en");
                    c.startActivity(i);


                }

            }
        });



    }

    @Override
    public int getItemCount() {
        return bArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView title;
        public ImageView web;
        public ImageView loco;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img =itemView.findViewById(R.id.logoforbook);
            title = itemView.findViewById(R.id.name);
            web = itemView.findViewById(R.id.logoforweb);
            loco = itemView.findViewById(R.id.logoforposi);


        }
    }




}
