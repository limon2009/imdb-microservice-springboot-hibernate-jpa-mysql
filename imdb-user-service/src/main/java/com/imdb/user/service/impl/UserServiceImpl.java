package com.imdb.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.imdb.user.model.User;
import com.imdb.user.repository.UserRepository;
import com.imdb.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
