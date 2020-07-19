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

public class LondonParksAdapter extends RecyclerView.Adapter {

    ArrayList<book> bArray;
    Context c;

    public LondonParksAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www.londoneye.com/");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.pwpark.com/");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.parliament.uk/bigben");
                    c.startActivity(i);


                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/London+eye/@34.540979,-12.1141061,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x487604b900d26973:0x4291f3172409ea92!2m2!1d-0.119543!2d51.503324");
                    c.startActivity(i);

                }
                else if (position == 1){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/paradise+wildlife+london/@34.6604579,-12.0694179,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48762119e90bd203:0x78a7f79018d64e08!2m2!1d-0.0622559!2d51.7440933");
                    c.startActivity(i);

                }
                else if (position == 2){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//big+ben/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x487604c38c8cd1d9:0xb78f2474b9a45aa9?sa=X&ved=2ahUKEwjawpmBvtTqAhWOzIUKHRgxCBgQ9RcwKnoECBgQEA");
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
