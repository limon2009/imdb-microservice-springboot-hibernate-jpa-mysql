package com.imdb.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imdb.movie.model.Genre;
import com.imdb.movie.repository.GenreRepository;
import com.imdb.movie.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreRepository genreRepository;

	@Override
	public List<Genre> getGenreList() {

		return genreRepository.findAll();
	}

}
