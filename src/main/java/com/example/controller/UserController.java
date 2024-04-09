package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public List<User> findAll() {
		return userService.findAll();
	}

	@PostMapping("/")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/{name}")
	public List<User> findByName(@PathVariable String name) {
		return userService.findByName(name);
	}

	@DeleteMapping("/{name}")
	public List<User> deleteByName(@PathVariable String name) {
		return userService.deleteByName(name);
	}

	@GetMapping("/{name}/{designation}")
	public List<User> findByNameAndDesignation(@PathVariable String name, @PathVariable String designation) {
		return userService.findByNameAndDesignation(name, designation);
	}

	@GetMapping("/allUsers")
	public List<User> getUsersCustomQuery() {
		return userService.getUsersCustomQuery();
	}
}
