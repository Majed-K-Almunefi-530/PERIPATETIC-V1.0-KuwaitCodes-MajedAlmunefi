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

public class bookAdapterukhotel extends RecyclerView.Adapter {
    ArrayList<book> bArray;
    Context c;

    public bookAdapterukhotel(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www3.hilton.com/en/hotels/united-kingdom/london-hilton-on-park-lane-LONHITW/index.html?WT.mc_id=zELWAKN0EMEA1HI2DMH3LocalSearch4DGGenericx6LONHITW");
                    c.startActivity(i);

                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.hyatt.com/en-US/hotel/england-united-kingdom/hyatt-regency-london-the-churchill/lonch?src=corp_lclb_gmb_seo_eame_lonch");
                    c.startActivity(i);


                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.marriott.com/hotels/travel/longh-jw-marriott-grosvenor-house-london/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_MjY5NjE0OC03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU=");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/london+hilton+on+park+lane+google+maps/@34.5451589,-12.1288517,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x4876052f99d7b523:0x477b77a33607c0cd!2m2!1d-0.1501698!2d51.5055513");
                    c.startActivity(i);

                }
                else if (position == 1){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/london+churchill+hotel/@34.5471241,-12.1323076,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48761accb64f84a9:0x7d829b39546d9a0d!2m2!1d-0.1571071!2d51.5156655");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//JW+Marriott+Grosvenor+House+London/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x48760533d54bc165:0xbd82f4f5c122c765?sa=X&ved=2ahUKEwiv3KG7stTqAhVJzBoKHevcAPsQ9RcwDHoECBcQEA");
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
