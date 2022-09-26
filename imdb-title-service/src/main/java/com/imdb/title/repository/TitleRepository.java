package com.imdb.title.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdb.title.model.Title;

@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {

}
