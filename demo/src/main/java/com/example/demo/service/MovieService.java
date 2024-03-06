package com.example.demo.service;

import com.example.demo.model.Movie;

import java.util.List;


public interface MovieService {

    List<Movie> listAllMovies();
    Movie saveMovie(Movie movie);
    List<Movie> findByTitleContaining(String title);
    List<Movie> findMovieByReleaseYear(Number releaseYear);
//    List<Movie> findMovieByReleaseYearBefore(Number releaseYear);
//    List<Movie> findMovieByReleaseYearAfter(Number releaseYear);
}
