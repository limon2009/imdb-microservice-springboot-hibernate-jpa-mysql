package com.imdb.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdb.user.model.CustomList;

@Repository
public interface CustomListRepository extends JpaRepository<CustomList, Long>{

	public List<CustomList> getCustomListByUserId(Long id);

}
