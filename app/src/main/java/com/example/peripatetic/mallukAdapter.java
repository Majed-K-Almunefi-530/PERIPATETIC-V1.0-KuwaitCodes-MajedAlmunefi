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

public class mallukAdapter extends RecyclerView.Adapter {
    ArrayList<book> bArray;
    Context c;

    public mallukAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://uk.westfield.com/london?utm_source=RET%2019WL&utm_medium=WEB&utm_campaign=GOO");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.harrods.com/");
                    c.startActivity(i);

                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.selfridges.com/GB/en/");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/westfield+london/@34.5440976,-12.1662652,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48760fd9a17c9f4d:0xe252903445e7660c!2m2!1d-0.2212054!2d51.5075725?hl=en");
                    c.startActivity(i);

                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/Harrods,+87-135+Brompton+Rd,+London+SW1X+7XL,+United+Kingdom/@34.5451589,-12.1354885,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x48760538ed2a30ff:0x15ee630d4b4e0d42!2m2!1d-0.1632344!2d51.4994055?hl=en");
                    c.startActivity(i);

                }
                else if (position == 2){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/selfridges+london/@34.5465423,-12.1299512,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x4876052d5803490d:0x811f22bae26bbdbe!2m2!1d-0.1527446!2d51.5144298?hl=en");
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
