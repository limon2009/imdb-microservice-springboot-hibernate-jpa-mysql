package com.imdb.people.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imdb.people.people.People;
import com.imdb.people.service.PeopleService;

@RestController
@RequestMapping("/api/people")
public class PeopleController {

	private final PeopleService peopleService;

	public PeopleController(PeopleService peopleService) {
		this.peopleService = peopleService;
	}

	@GetMapping("/all")
	public List<People> getAllCast() {
		return peopleService.getAllPeople();
	}

}
