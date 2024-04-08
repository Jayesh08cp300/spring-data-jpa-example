package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}

	public List<User> deleteByName(String name) {
		return userRepository.deleteByName(name);
	}

	public List<User> findByNameAndDesignation(String name, String designation) {
		return userRepository.findByNameAndDesignation(name, designation);
	}
}
