package com.example.android.final1.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.final1.R;
import com.example.android.final1.movies.Movies;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myholder>{

    private Context context;

    private ArrayList<Movies> moviesArrayList;

    public Context getContext() {
        return context;
    }


    public ArrayList<Movies> getMoviesArrayList() {
        return moviesArrayList;
    }

    public MyAdapter(Context ccontext,ArrayList<Movies> movies) {
        moviesArrayList = movies;
        context=ccontext;
    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.signin1,null);
        Myholder myholder=new Myholder(view);
        return myholder;
    }
   @Override
    public void onBindViewHolder(Myholder holder, int position) {
        holder.imageView.setImageResource(moviesArrayList.get(position).getMovieImageId());
        holder.textView.setText(moviesArrayList.get(position).getMovieName());
    }

    @Override
    public int getItemCount() {
        return moviesArrayList.size();
    }

    public static class Myholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public Myholder(View itemview)
        {
            super(itemview);
            imageView = (ImageView) itemview.findViewById(R.id.movie_imageview);
            textView = (TextView)itemview.findViewById(R.id.tv_item_number);

        }
    }
}