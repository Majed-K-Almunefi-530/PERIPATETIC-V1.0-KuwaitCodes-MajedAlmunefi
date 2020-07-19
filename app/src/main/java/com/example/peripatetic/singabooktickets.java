package com.example.peripatetic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class singabooktickets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singabooktickets);


        ArrayList<book> books = new ArrayList<>();

        book p1 =new book(R.drawable.hiltonsinga ,"Hilton " , R.drawable.web1 , R.drawable.location);
        book p2 =new book(R.drawable.shangirla ,"shangri-la" , R.drawable.web1 , R.drawable.location);
        book p3 =new book(R.drawable.sofitel ,"Sofitel" , R.drawable.web1 , R.drawable.location);



        books.add(p1);
        books.add(p2);
        books.add(p3);



        RecyclerView rv =findViewById(R.id.RV);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lmm = new LinearLayoutManager(this);
        rv.setLayoutManager(lmm);


        BookAdapter bookerr = new BookAdapter(books,this);
        rv.setAdapter(bookerr);



        Toast toast = Toast.makeText(getApplicationContext(),
                "Click on the left corner(=) for more",
                Toast.LENGTH_SHORT);

        toast.show();



            /*new MaterialShowcaseView.Builder(this)
                .setTarget(mButtonShow)
                .setDismissText("GOT IT")
                .setContentText("This is some amazing feature you should know about")
                .setDelay(withDelay) // optional but starting animations immediately in onCreate can make them choppy
                .singleUse(SHOWCASE_ID) // provide a unique ID used to ensure it is only shown once
                .show();*/






        SharedPreferences preferences = getApplication().getSharedPreferences("prefr", Context.MODE_PRIVATE);
        String user = preferences.getString("username", "");


        @SuppressLint("ResourceAsColor") AccountHeader hr = new AccountHeaderBuilder ()
                .withActivity (this)
                .withHeaderBackground (R.drawable.singapore)
                .withTextColorRes (R.color.dark)
                .addProfiles(new ProfileDrawerItem ().withName ("PERIPATETIC").withEmail (user).withIcon (R.drawable.logoforapp))
                .build ();

        PrimaryDrawerItem item1 = new PrimaryDrawerItem() .withIdentifier(1) .withName ("Hotels").withIcon (R.drawable.hotell);

        PrimaryDrawerItem item2 = new PrimaryDrawerItem() .withIdentifier(2) .withName ("Malls").withIcon (R.drawable.mall);

        PrimaryDrawerItem item3 = new PrimaryDrawerItem() .withIdentifier(3) .withName ("Theme parks").withIcon (R.drawable.theme);

        PrimaryDrawerItem item4 = new PrimaryDrawerItem() .withIdentifier(4) .withName ("restaurants").withIcon (R.drawable.food);

        SecondaryDrawerItem item8 = new SecondaryDrawerItem() .withIdentifier(8) .withName ("Contact us!").withIcon (R.drawable.cntactme);

        SecondaryDrawerItem item9 = new SecondaryDrawerItem() .withIdentifier(9) .withName ("Profile settings").withIcon (R.drawable.usersettings);

        SecondaryDrawerItem item10 = new SecondaryDrawerItem() .withIdentifier(10) .withName ("Home").withIcon (R.drawable.home);

        SecondaryDrawerItem item11 = new SecondaryDrawerItem() .withIdentifier(11) .withName ("Back").withIcon (R.drawable.back);



        Toolbar toolBar = findViewById (R.id.toolbar);


        new DrawerBuilder ()
                .withActivity (this)
                .withToolbar (toolBar)
                .withAccountHeader (hr)
                .addDrawerItems(item1)
                .addDrawerItems(item2)
                .addDrawerItems(item3)
                .addDrawerItems(item4)

                .addDrawerItems(new DividerDrawerItem())

                .addDrawerItems(item8)
                .addDrawerItems (item9)
                .addDrawerItems (item10)
                .addDrawerItems (item11)
                .withOnDrawerItemClickListener (new Drawer.OnDrawerItemClickListener () {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        if (drawerItem.getIdentifier ()==1) {
                            Intent a = new Intent (singabooktickets.this,singabooktickets.class);
                            startActivity (a);

                        }

                        if (drawerItem.getIdentifier ()==2) {
                            Intent b = new Intent (singabooktickets.this,Mallbook.class);
                            startActivity (b);

                        }

                        if(drawerItem.getIdentifier ()==3) {

                            Intent c = new Intent (singabooktickets.this, Parkactivitysingapore.class);
                            startActivity (c);
                        }

                        if(drawerItem.getIdentifier ()==4) {

                            Intent d = new Intent (singabooktickets.this, resturante.class);
                            startActivity (d);
                        }






                        if(drawerItem.getIdentifier ()==8) {

                            Intent g = new Intent (singabooktickets.this, contact_us.class);
                            startActivity (g);
                        }

                        if(drawerItem.getIdentifier ()==9) {

                            Intent h = new Intent (singabooktickets.this, Name_page.class);
                            startActivity (h);
                        }

                        if(drawerItem.getIdentifier ()==10) {

                            Intent i = new Intent (singabooktickets.this, aboutus.class);
                            startActivity (i);
                        }
                        if(drawerItem.getIdentifier ()==11) {

                            Intent i = new Intent (singabooktickets.this, singaporecitychoose.class);
                            startActivity (i);
                        }
                        return false;
                    }
                })


                .build ();
    }
}

