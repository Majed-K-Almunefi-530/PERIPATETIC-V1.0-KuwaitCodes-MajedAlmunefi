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

public class AusParkAdapter extends RecyclerView.Adapter {



    ArrayList<book> bArray;
    Context c;

    public AusParkAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www.sydneyoperahouse.com/");
                    c.startActivity(i);

                }
                else if (position == 1){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://en.wikipedia.org/wiki/Bondi_Beach");
                    c.startActivity(i);

                }
                else if (position == 2){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://taronga.org.au/sydney-zoo");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//sydney+opera+house/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x6b12ae665e892fdd:0x3133f8d75a1ac251?sa=X&hl=en&ved=2ahUKEwihs5Phi9jqAhUGyIUKHYJfDLEQ9RcwIXoECCYQBA");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//bondi+beach/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x6b12ad9c447281c7:0x20c31809c62de978?sa=X&hl=en&ved=2ahUKEwjgt5v2i9jqAhUlyYUKHWdkD3MQ9RcwKXoECBkQDA");
                    c.startActivity(i);

                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/taronga+zoo/@-0.1445658,13.28537,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x6b12ac245aaaaaab:0xaeb9849c7a29e226!2m2!1d151.2413418!2d-33.8435473?hl=en");
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
