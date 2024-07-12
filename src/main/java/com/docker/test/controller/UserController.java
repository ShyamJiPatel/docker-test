package com.docker.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.test.entity.User;
import com.docker.test.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/user/getAll")
	public List<User> getAllUsers() {
		return this.userService.findAll();
	}

	@PostMapping(value = "/user/save")
	public User addChatMember(@RequestBody User user) {
		return this.userService.save(user);
	}

}
