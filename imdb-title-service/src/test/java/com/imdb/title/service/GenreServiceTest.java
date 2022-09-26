package com.imdb.title.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.imdb.title.ImdbTitleServiceApplication;
import com.imdb.title.model.Genre;

@SpringBootTest(classes = ImdbTitleServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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
