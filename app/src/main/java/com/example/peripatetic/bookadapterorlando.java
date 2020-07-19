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

public class bookadapterorlando extends RecyclerView.Adapter {




    ArrayList<book> bArray;
    Context c;

    public bookadapterorlando(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","https://www3.hilton.com/en/hotels/florida/hilton-orlando-ORLOCHH/index.html?SEO_id=GMB-HI-ORLOCHH");
                    c.startActivity(i);

                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.marriott.com/hotels/travel/mcojw-jw-marriott-orlando-grande-lakes/?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_MjA5Mzk1MS03MTUtbG9jYXRpb24uZ29vZ2xlX3dlYnNpdGVfb3ZlcnJpZGU=");
                    c.startActivity(i);

                }
                else if (position == 2){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.ritzcarlton.com/en/hotels/florida/orlando?scid=bb1a189a-fec3-4d19-a255-54ba596febe2&y_source=1_NTc3MjYxLTcxNS1sb2NhdGlvbi5nb29nbGVfd2Vic2l0ZV9vdmVycmlkZQ==");
                    c.startActivity(i);

                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//hilton+orlando/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x88e77e390a91cf6f:0xc0ac4aa79defb1ab?sa=X&ved=2ahUKEwjrr6GBu9XqAhVCzRoKHXIlC1EQ9RcwDXoECBUQEA");
                    c.startActivity(i);


                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/jw+marriott+orlando/@1.7768058,-103.5033288,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x88e77e075e1ae533:0x83511fd4828f3088!2m2!1d-81.4285587!2d28.4016613");
                    c.startActivity(i);

                }
                else if (position == 2){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//ritz+carlton+orlando/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x88e77dfdb7bc3165:0x499e51a1f80ce26a?sa=X&ved=2ahUKEwjL-b66vdXqAhULExoKHdWOAt4Q9RcwFHoECBgQEA");
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
