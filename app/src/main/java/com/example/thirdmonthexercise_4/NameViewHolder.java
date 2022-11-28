package com.example.thirdmonthexercise_4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView;
    LinearLayout itemContainer;
    TextView lineTextView;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.name_tv);
        itemContainer = itemView.findViewById(R.id.name_container);
        lineTextView = itemView.findViewById(R.id.line_tv);
    }

    public void bind(String name) {
        nameTextView.setText(name);
    }

}
