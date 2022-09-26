package com.imdb.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imdb.user.model.CustomList;
import com.imdb.user.service.CustomListService;

@RestController
@RequestMapping("/api/user/list")
public class CustomListController {

	private final CustomListService customListService;

	public CustomListController(CustomListService customListService) {
		this.customListService = customListService;
	}

	@GetMapping("/mylist/{id}")
	public List<CustomList> getCustomListByUserId(@PathVariable(value = "id") Long userId) {
		return customListService.getCustomListByUserId(userId);
	}

	@GetMapping("/details/{id}")
	public Optional<CustomList> getCustomListById(@PathVariable(value = "id") Long customListId) {
		return customListService.getCustomListById(customListId);
	}

}
