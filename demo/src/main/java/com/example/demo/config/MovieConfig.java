package com.example.demo.config;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MovieConfig {

//    @Bean
//    CommandLineRunner commandLineRunner(MovieRepository repository){
//        return args -> {
//            Movie movie1 = new Movie("Titanic", "sdnkfjs", "romance", 1990, 5.3);
//            Movie movie2 = new Movie("The Notebook", "asdsf", "drama", 1999, 2.3);
//        repository.saveAll(List.of(movie1, movie2));
//        };
//    }
}
