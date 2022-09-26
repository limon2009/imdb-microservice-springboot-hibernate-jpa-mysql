package com.imdb.title.service;

import java.util.List;

import com.imdb.title.model.Title;

public interface TitleService {

	public List<Title>getAllTitles();
	
	public Title getTitleById(Long id);
}
