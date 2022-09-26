package com.imdb.people.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imdb.people.people.People;

public interface PeopleRepository extends JpaRepository<People, Long>{

}
