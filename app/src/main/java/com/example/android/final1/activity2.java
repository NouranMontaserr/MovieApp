package com.example.android.final1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.final1.Adapter.MyAdapter;
import com.example.android.final1.movies.List_details;
import com.example.android.final1.movies.Movies;

import java.util.ArrayList;

public class activity2 extends AppCompatActivity {

    ArrayList<Movies> movies;
    MyAdapter myAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        recyclerView =(RecyclerView)findViewById(R.id.recycler_view);
        movies= List_details.getlist();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(activity2.this, 1);
        gridLayoutManager.setSpanCount(1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        myAdapter=new MyAdapter(activity2.this,movies);
        recyclerView.setAdapter(myAdapter);
    }
}
