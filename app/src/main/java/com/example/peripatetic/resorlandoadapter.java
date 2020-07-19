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

public class resorlandoadapter extends RecyclerView.Adapter {



    ArrayList<book> bArray;
    Context c;

    public resorlandoadapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://locations.bucadibeppo.com/us/fl/orlando/8001-s-orange-blossom-trail?utm_source=google&utm_campaign=local-listing&utm_medium=organic&utm_content=gmb");
                    c.startActivity(i);
                }
                else if (position == 1){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.kekes.com/home");
                    c.startActivity(i);



                }
                else if (position == 2){

                    String url = "https://www.margaritavilleorlando.com/";

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.margaritavilleorlando.com/");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/buca+orlando/@1.7780091,-103.4859692,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x88e77c4b64b72283:0xb7224af0f7ae1aae!2m2!1d-81.3925141!2d28.4444397?hl=en");
                    c.startActivity(i);

                }
                else if (position == 1){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//restaurant+in+orlando/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x88e7872433aad2f1:0x507f399ca5d32c55?sa=X&hl=en&ved=2ahUKEwjcz9eJ0dXqAhWnxoUKHZ7gCh0Q9RcwAHoECAkQCQ");
                    c.startActivity(i);

                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//restaurants+in+universal+citywalk+orlando/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x88e77ee72bc69fc1:0xc7bbaefc69ca2a21?sa=X&hl=en&ved=2ahUKEwiiqO7K0tXqAhUhzoUKHef2AAUQ9RcwAHoECAoQCg");
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
