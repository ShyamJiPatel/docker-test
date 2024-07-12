package com.docker.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.test.dao.UserRepository;
import com.docker.test.entity.User;
import com.docker.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		List<User> userList = new ArrayList<>();
		userRepository.findAll().forEach(user -> userList.add(user));
		return userList;
	}

}
