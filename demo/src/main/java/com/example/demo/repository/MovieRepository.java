package com.example.demo.repository;

import com.example.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContaining(String title);
    List<Movie> findMovieByReleaseYear(Number releaseYear);
//    List<Movie> findMovieByReleaseYearBefore(Number releaseYear);
//    List<Movie> findMovieByReleaseYearAfter(Number releaseYear);
}
