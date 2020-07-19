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

public class londonParkAdapter extends RecyclerView.Adapter {


    ////
    ////
    // THE NAMING IS INCORRECT THIS IS FOR AFRICA NAMI NAMI NA HEHE
    ///
    ///



    ArrayList<book> bArray;
    Context c;

    public londonParkAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","http://capepointostrichfarm.com/");
                    c.startActivity(i);

                }
                else if (position == 1){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.tablemountain.net/");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","http://sandboardingcapetown.com/");
                    c.startActivity(i);
                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/Cape+Point+Ostrich+Farm,+Plateau+Rd,+Cape+Peninsula,+Cape+Town,+7985,+South+Africa/@-0.9867031,-9.2744752,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1dcc4896353f9bf9:0xa4332c218d3ce352!2m2!1d18.4517926!2d-34.253206?hl=en");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//table+mountain/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x1dcc67f7b1b2b61f:0x5fdb77f98d0dfeb4?sa=X&hl=en&ved=2ahUKEwi27c235dfqAhWIlxQKHUn4Bg4Q9RcwH3oECBkQDA");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//sandboarding+cape+town/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x1dcc68d0569d6a53:0x2c071026fa7d0450?sa=X&hl=en&ved=2ahUKEwj5iYri5dfqAhVKDGMBHYkyCKgQ9RcwGXoECBcQEQ");
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
