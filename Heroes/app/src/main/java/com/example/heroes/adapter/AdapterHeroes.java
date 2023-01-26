package com.example.heroes.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterHeroes extends RecyclerView.Adapter<AdapterHeroes.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, owner;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
        }


        }

    @NonNull
    @Override

public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return null;
}

    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    }


    public int getItemCount() {
        return 0;
}
}