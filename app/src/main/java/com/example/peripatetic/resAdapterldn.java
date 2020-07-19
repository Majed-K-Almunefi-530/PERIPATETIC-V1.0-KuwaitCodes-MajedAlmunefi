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

public class resAdapterldn extends RecyclerView.Adapter {


    ArrayList<book> bArray;
    Context c;

    public resAdapterldn(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www.naclondon.co.uk/");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.askitalian.co.uk/");
                    c.startActivity(i);

                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","http://www.novikovrestaurant.co.uk/");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/nac+london/@34.5460411,-12.1324547,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x4876053286565dc9:0x5e8818df1bc3dea1!2m2!1d-0.1533375!2d51.5124742");
                    c.startActivity(i);

                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/ASK+Italian,+Spice+Quay,+Butlers+Wharf,+34+Shad+Thames,+London+SE1+2YG,+United+Kingdom/@34.5451589,-12.0923324,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48760347c81904e3:0x7114eb3fa477caa5!2m2!1d-0.072174!2d51.5030192");
                    c.startActivity(i);

                }
                else if (position == 2){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/novikov+london/@34.5451589,-12.1258149,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48760529b999c21d:0x549dee0a1aac950!2m2!1d-0.1429232!2d51.5076236");
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
