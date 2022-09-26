package com.imdb.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.imdb.user.model.CustomList;
import com.imdb.user.repository.CustomListRepository;
import com.imdb.user.service.CustomListService;

@Service
public class CustomListServiceImpl implements CustomListService {

	private final CustomListRepository customListRepository;

	public CustomListServiceImpl(CustomListRepository customListRepository) {
		this.customListRepository = customListRepository;
	}

	@Override
	public List<CustomList> getCustomListByUserId(Long userId) {
		return customListRepository.getCustomListByUserId(userId);
	}

	@Override
	public Optional<CustomList> getCustomListById(Long customListId) {
		return customListRepository.findById(customListId);
	}

}
