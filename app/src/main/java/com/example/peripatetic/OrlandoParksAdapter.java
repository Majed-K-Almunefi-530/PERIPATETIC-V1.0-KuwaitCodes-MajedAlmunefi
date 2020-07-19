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

public class OrlandoParksAdapter extends RecyclerView.Adapter {



    ArrayList<book> bArray;
    Context c;

    public OrlandoParksAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://disneyworld.disney.go.com/?CMP=OKC-80007798_GM_WDW_destination_waltdisneyworldresort_NA");
                    c.startActivity(i);

                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://shop.universalorlando.com/");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://seaworld.com/orlando/tickets/?utm_source=google&utm_id=go_cmp-1471195112_adg-57098953655_ad-449982485482_kwd-50346833_dev-c_ext-&gclid=CjwKCAjwmMX4BRAAEiwA-zM4JutpDAp0D2pOGyWnQYobKYqAN2SnSufcCol9pZaBWegVF2YQ0UJXwBoCbxIQAvD_BwE");
                    c.startActivity(i);
                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//disney+orlando/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x88dd7ee634caa5f7:0xa71e391fd01cf1a0?sa=X&hl=en&ved=2ahUKEwiv1dOCzdXqAhWOy4UKHeVODS4Q9RcwHnoECBoQDg");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/universal+studios+orlando/@1.7791624,-103.5157255,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x88e77ec39415df75:0xf985d8fc7734a5a1!2m2!1d-81.4507553!2d28.485448?hl=en");
                    c.startActivity(i);

                }
                else if (position == 2){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//7007+SeaWorld+Drive,+Orlando,+FL+32821/@28.4097001,-81.529751,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x88e77e288cd6237f:0x997f9e39a3d62bd5!2m2!1d-81.4597107!2d28.409718?hl=en");
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
