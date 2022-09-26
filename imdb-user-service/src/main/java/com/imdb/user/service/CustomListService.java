package com.imdb.user.service;

import java.util.List;
import java.util.Optional;

import com.imdb.user.model.CustomList;

public interface CustomListService {
	public List<CustomList> getCustomListByUserId(Long userId);
	public Optional<CustomList> getCustomListById(Long customListId);

}
