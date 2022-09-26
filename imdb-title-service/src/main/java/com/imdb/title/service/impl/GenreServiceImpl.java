package com.imdb.title.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imdb.title.model.Genre;
import com.imdb.title.repository.GenreRepository;
import com.imdb.title.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreRepository genreRepository;

	@Override
	public List<Genre> getGenreList() {
		return genreRepository.findAll();
	}

}
