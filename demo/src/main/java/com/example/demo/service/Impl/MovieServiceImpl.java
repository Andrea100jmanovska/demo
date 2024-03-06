package com.example.demo.service.Impl;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public List<Movie> listAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> findByTitleContaining(String title) {
        if(title!=null){
            return movieRepository.findByTitleContaining(title);
        }
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> findMovieByReleaseYear(Number releaseYear) {
        if(releaseYear!=null){
            return movieRepository.findMovieByReleaseYear(releaseYear);
        }
        return movieRepository.findAll();
    }

//    @Override
//    public List<Movie> findMovieByReleaseYearBefore(Number releaseYear) {
//        if(releaseYear!=null){
//            return movieRepository.findMovieByReleaseYearBefore(releaseYear<movieRepository.);
//        }
//        return movieRepository.findAll();
//    }
//
//    @Override
//    public List<Movie> findMovieByReleaseYearAfter(Number releaseYear) {
//        return null;
    }


