package com.docker.test.service;

import java.util.List;

import com.docker.test.entity.User;

public interface UserService {
	User save(User user);

	List<User> findAll();
}
