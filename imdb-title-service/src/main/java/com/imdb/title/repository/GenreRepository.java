package com.imdb.title.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdb.title.model.Genre;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
