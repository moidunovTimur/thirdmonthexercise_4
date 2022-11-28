package com.example.thirdmonthexercise_4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private ArrayList<String> title;

    public MainActivity listener;

    public NameAdapter(ArrayList<String> title, MainActivity listener) {
        this.title = title;
        this . listener = listener;

    }
    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, @SuppressLint("RecyclerView") int position) {
      holder.bind(title.get(position));

      holder.itemContainer.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              listener.onItemClickListener(title.get(position));
          }
      });
    }

    @Override
    public int getItemCount() {
        return title.size();
    }

}
