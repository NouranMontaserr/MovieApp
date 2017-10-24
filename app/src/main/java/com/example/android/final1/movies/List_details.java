package com.example.android.final1.movies;

import com.example.android.final1.R;
import java.util.ArrayList;


public class List_details {
    public static ArrayList<Movies> getlist(){
        ArrayList<Movies> movies=new ArrayList<Movies>();
        movies.add(new Movies(R.drawable.m1,"movie1"));
        movies.add(new Movies(R.drawable.m2,"movie2"));
        return movies;
    }
}
