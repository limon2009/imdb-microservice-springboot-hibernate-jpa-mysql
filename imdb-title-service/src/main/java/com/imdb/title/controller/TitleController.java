package com.imdb.title.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imdb.title.model.Title;
import com.imdb.title.service.TitleService;

@RestController
@RequestMapping("/api/title")
public class TitleController {

	private final TitleService titleService;

	public TitleController(TitleService titleService) {
		this.titleService = titleService;
	}

	@GetMapping("/all")
	public List<Title> getAllMovies() {
		return titleService.getAllTitles();
	}

	@GetMapping("/{id}")
	public Title getMovieById(@PathVariable(value = "id") Long titleId) {
		return titleService.getTitleById(titleId);
	}
}
