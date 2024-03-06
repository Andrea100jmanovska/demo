package com.example.demo;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class AuctatestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AuctatestApplication.class, args);
	}

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public void run(String... args) throws Exception {
		Movie movie1 = new Movie(1L, "Titanic", "sdnkfjs", "romance", 1990, 5.3);
		Movie movie2 = new Movie(2L, "The Notebook", "asdsf", "drama", 1999, 2.3);
		Movie movie3 = new Movie(3L, "Gone With The Wind", "asdsf", "thriller", 1786, 3.4);
		Movie movie4 = new Movie(4L,"Rockie 2", "asdsf", "action", 1984, 7.8);
		movieRepository.saveAll(List.of(movie1, movie2, movie3, movie4));
	}
}
