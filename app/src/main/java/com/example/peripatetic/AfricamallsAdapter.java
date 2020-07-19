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

public class AfricamallsAdapter extends RecyclerView.Adapter {



    ArrayList<book> bArray;
    Context c;

    public AfricamallsAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www.baysidecentre.com/");
                    c.startActivity(i);

                }
                else if (position == 1){




                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.baysidecentre.com/");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.gardensshoppingcentre.co.za/");
                    c.startActivity(i);


                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//Cape+Quarter+Lifestyle+Village/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x1dcc675d70c13d95:0xa34dfff6d83e02e0?sa=X&hl=en&ved=2ahUKEwjToYPK4NfqAhVB8BQKHT1qDHAQ9RcwDHoECBYQEQ");
                    c.startActivity(i);


                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/Bayside+Mall/@-0.8468562,-9.2758768,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1dcc5f124e4870dd:0xa08ad8d2e7c98765!2m2!1d18.4891102!2d-33.8234929?hl=en");
                    c.startActivity(i);


                }
                else if (position == 2){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/gardens+shopping+centre/@-0.863636,-9.2757199,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1dcc67790a1509ab:0xc875c6bc2999639a!2m2!1d18.4180885!2d-33.9345136?hl=en");
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
