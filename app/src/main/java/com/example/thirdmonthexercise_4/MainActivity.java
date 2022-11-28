package com.example.thirdmonthexercise_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements itemClickListener {

    RecyclerView titleRecyclerView;
    private ArrayList<String> title;
    TextView lineTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleRecyclerView= findViewById(R.id.title_rv);

        title = new ArrayList<>();

        setTitle();
        titleRecyclerView.setAdapter(new NameAdapter(title,this));

    }

    private void setTitle() {
        title.add("Samsung");
        title.add("Iphone");
        title.add("Honor");
        title.add("Nokia");
        title.add("Redmi");
        title.add("Hyavey");
        title.add("lenovo");
    }

    public void onItemClickListener(String name) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
}