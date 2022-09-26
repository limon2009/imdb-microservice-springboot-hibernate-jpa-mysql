package com.imdb.title.repository;

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
public class GenreRepositoryTest {

	@Autowired
	private GenreRepository genreRepository;
	
	@Test
	public void testGenreList() {
		List<Genre> genreList = genreRepository.findAll();
		assertTrue(genreList.size() == 13);
	}
}
