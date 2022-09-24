package com.imdb.moviecom.imdb.movie.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.imdb.movie.ImdbMovieMicroserviceApplication;
import com.imdb.movie.model.Genre;
import com.imdb.movie.service.GenreService;

@SpringBootTest(classes = ImdbMovieMicroserviceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class GenreServiceTest {

	@Autowired
	private GenreService genreService;

	@Test
	public void testGenreList() {
		List<Genre> genreList = genreService.getGenreList();
		assertTrue(genreList.size() == 13);
	}
}
