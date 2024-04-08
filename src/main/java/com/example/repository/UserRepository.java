package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> deleteByName(String name);

	List<User> findByName(String name);

	List<User> findByNameAndDesignation(String name, String designation);
}
