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

public class AfricahotelAdapter extends RecyclerView.Adapter {

    ArrayList<book> bArray;
    Context c;

    public AfricahotelAdapter(ArrayList<book> bArray, Context c) {
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
                    i.putExtra("data","http://www.atlanticviewcapetown.com/");
                    c.startActivity(i);


                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://thebayhotel.com/");
                    c.startActivity(i);

                }
                else if (position == 2){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.radissonhotels.com/en-us/hotels/radisson-blu-cape-town-waterfront?cid=a:se+b:gmb+c:emea+i:local+e:rdb+d:mea+h:CPTZA");
                    c.startActivity(i);


                }
            }
        });

        ((ViewHolder) holder).loco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0){



                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//atlanticview+cape+town/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x1dcc67b4057d2137:0x5eae658d6ecb2063?sa=X&ved=2ahUKEwi-oKjx3dfqAhWGzoUKHaBDCuAQ9RcwFnoECBYQEA");
                    c.startActivity(i);


                }
                else if (position == 1){


                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir/29.3399538,47.9713124/the+bay+hotel+cape+town/@-0.8713813,-9.2756464,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x1dcc6652e4343943:0xb5fb11b53539e40f!2m2!1d18.3782!2d-33.95254?hl=en");
                    c.startActivity(i);


                }
                else if (position == 2){

                    Intent i = new Intent(c,WebViewActivity.class);
                    i.putExtra("data","https://www.google.com/maps/dir//Radisson+Blu+Hotel+Waterfront,+Cape+Town/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x1dcc6917a8d51e8d:0xb9963fc61c93a655?sa=X&hl=en&ved=2ahUKEwiur6T_3tfqAhWHoBQKHcNACvsQ9RcwDXoECBkQEA");
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
