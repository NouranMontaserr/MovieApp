package com.example.android.final1.movies;

/**
 * Created by Lenovo on 10/18/2017.
 */

public class Movies {
    private String movieName;
    private int movieImageId;

    //constructor

    public Movies(int movieImageId, String movieName) {
        this.movieImageId = movieImageId;
        this.movieName = movieName;
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieImageId() {
        return movieImageId;
    }

    public void setMovieImageId(int movieImageId) {
        this.movieImageId = movieImageId;
    }
}
