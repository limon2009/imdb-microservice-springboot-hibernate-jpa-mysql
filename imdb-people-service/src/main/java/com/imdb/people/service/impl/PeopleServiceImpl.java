package com.imdb.people.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.imdb.people.people.People;
import com.imdb.people.repository.PeopleRepository;
import com.imdb.people.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService {

	final private PeopleRepository peopleRepository;

	public PeopleServiceImpl(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;
	}

	@Override
	public List<People> getAllPeople() {
		return peopleRepository.findAll();
	}

}
