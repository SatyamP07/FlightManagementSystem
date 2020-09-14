package com.example.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.User;

@Service
public interface UserService {

	User addUser(User user);
	User viewUser(Long userId);
	List<User> viewUser();
	User updateUser(User user);
	void deleteUser(Long userId);
	void validateUser(User user);
	
}
