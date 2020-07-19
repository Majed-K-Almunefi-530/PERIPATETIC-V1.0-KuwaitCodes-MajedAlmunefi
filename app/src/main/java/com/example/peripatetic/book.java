package com.example.peripatetic;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

public class book extends RecyclerView.Adapter implements Serializable {
    private int imagelogo;
    private String title;
    private int imageweb;
    private int imageloco;


    public book(int imagelogo, String title, int imageweb, int imageloco) {
        this.imagelogo = imagelogo;
        this.title = title;
        this.imageweb = imageweb;
        this.imageloco = imageloco;
    }

    public int getImagelogo() {
        return imagelogo;
    }

    public void setImagelogo(int imagelogo) {
        this.imagelogo = imagelogo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageweb() {
        return imageweb;
    }

    public void setImageweb(int imageweb) {
        this.imageweb = imageweb;
    }

    public int getImageloco() {
        return imageloco;
    }

    public void setImageloco(int imageloco) {
        this.imageloco = imageloco;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
