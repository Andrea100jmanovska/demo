package com.example.demo.web;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Properties;

@Controller
public class MoviesController {

    private final MovieService movieService;

    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public String listMovies(@RequestParam(required = false) String title,
                             Model model){
        List<Movie> movies;
        if (title == null ) {
            movies = this.movieService.listAllMovies();
        } else {
            movies = this.movieService.findByTitleContaining(title);
        }
        model.addAttribute("movies", movies);
        return "movies.html";
    }
//    @GetMapping("/search")
//    public ResponseEntity<List<Movie>> searchByTitle(@RequestParam String title) {
//        List<Movie> movies = movieService.findMovieByTitleContaining(title);
//        return ResponseEntity.ok().body(movies);
//    }

    @GetMapping("/movies/new")
    public String create(Model model){
        Movie movie = new Movie();
        model.addAttribute("movie", movie);
        return "create_movie";
    }

    @PostMapping("/movies")
    public String saveMovie(@ModelAttribute("movie") Movie movie){
        movieService.saveMovie(movie);
        return "redirect:/movies";
    }
}
