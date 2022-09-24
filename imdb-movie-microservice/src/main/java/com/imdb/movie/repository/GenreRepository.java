package com.imdb.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdb.movie.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
