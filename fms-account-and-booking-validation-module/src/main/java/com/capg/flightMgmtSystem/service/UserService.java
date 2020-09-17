package com.example.application.service;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.stereotype.Service;

import com.example.application.entities.User;
import com.example.application.exceptions.UserAlreadyExistsException;

public interface UserService {

	void addUser(User user) throws MessagingException, UserAlreadyExistsException;
	User viewUser(Long userId);
	List<User> viewUser();
	User updateUser(User user);
	void deleteUser(Long userId);
	void validateUser(User user) throws MessagingException;
}
