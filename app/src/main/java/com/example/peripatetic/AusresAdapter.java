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

public class AusresAdapter extends RecyclerView.Adapter {










    ArrayList<book> bArray;
    Context c;

    public AusresAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www.quay.com.au/");
                    c.startActivity(i);



                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.saintpeter.com.au/");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.yellowsydney.com.au/");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//quay+sydney/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x6b12ae5d0d1cc4e1:0x94f51e121cc41433?sa=X&hl=en&ved=2ahUKEwjD2MDUjtjqAhWOy4UKHeVODS4Q9RcwDXoECBkQDw");
                    c.startActivity(i);


                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//Saint+Peter+sydney/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x6b12ae065a1be5f7:0xde7423a2b454d86b?sa=X&hl=en&ved=2ahUKEwjFyrnvjtjqAhWKyYUKHV5iCLAQ9RcwFnoECBcQEQ");
                    c.startActivity(i);

                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/Yellow+sydney/@-0.1453728,13.277384,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x6b12ae73c8b27f25:0x6c86f63a308ed1b5!2m2!1d151.2254334!2d-33.8686979?hl=en");
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
