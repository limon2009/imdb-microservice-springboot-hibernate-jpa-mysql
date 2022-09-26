package com.imdb.title.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imdb.title.exception.ResourceNotFoundException;
import com.imdb.title.model.Title;
import com.imdb.title.repository.TitleRepository;
import com.imdb.title.service.TitleService;

@Service
public class TitleServiceImpl implements TitleService {

	@Autowired
	private TitleRepository titleRepository;

	@Override
	public List<Title> getAllTitles() {
		return titleRepository.findAll();
	}

	@Override
	public Title getTitleById(Long id) {
		return titleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie", "id", id));
	}

}
