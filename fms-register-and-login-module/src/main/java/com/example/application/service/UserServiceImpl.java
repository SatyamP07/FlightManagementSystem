package com.example.application.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.application.entities.User;
import com.example.application.exceptions.InvalidPasswordException;
import com.example.application.exceptions.UserNotFoundException;
import com.example.application.model.Credentials;
import com.example.application.model.UserInfo;
import com.example.application.repositories.UserRepository;
import com.example.application.utility.Encryption;

public class UserServiceImpl implements UserService {

	Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserInfo addUser(User user) {
		user.setPassword(Encryption.passwordEncryptor(user.getPassword()));
		logger.info("Added User with userId " + user.getUserId());
		user = userRepository.save(user);
		return new UserInfo(user);
	}

	@Override
	public UserInfo viewUser(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			UserInfo userinfo = new UserInfo(user.get());
			logger.info("Retrived User with userId " + user.get().getUserId());
			return userinfo;
		}
		else {
			logger.info("User with userId " + user.get().getUserId() + " not found");
			throw new UserNotFoundException("No user with userId " + userId);
		}
	}

	@Override
	public List<UserInfo> viewUser() {
		List<User> users = userRepository.findAll();
		logger.info("Retriving all the users");
		return users.stream().filter(user -> user.getUserType().equals("USER"))
				.map(user -> new UserInfo(user)).collect(Collectors.toList());
	}

	@Override
	public UserInfo updateUser(User user) {
		user.setPassword(Encryption.passwordEncryptor(user.getPassword()));
		logger.info("Updated User with userId " + user.getUserId());
		user = userRepository.save(user);
		return new UserInfo(user);
	}
	
	@Override
	public UserInfo updateUser(UserInfo userInfo) {
		User user = userRepository.findById(userInfo.getUserId()).get();
		user.setUserName(userInfo.getUserName());
		user.setEmail(userInfo.getEmail());
		user.setPhoneNumber(userInfo.getPhoneNumber());
		user = userRepository.save(user);
		return new UserInfo(user);
	}

	@Override
	public String deleteUser(Long userId) {
		String userName = userRepository.findById(userId).get().getUserName();
		userRepository.deleteById(userId);
		logger.info("Deleted User with userId " + userId);
		return userName;
	}
	
	@Override
	public UserInfo authenticateUser(Credentials credentials) {
		Optional<User> user = userRepository.findById(credentials.getUserId());
		if(user.isPresent() && user.get().getUserType().equals("USER")) {
			if(user.get().getPassword().equals(Encryption.passwordEncryptor(credentials.getPassword()))) {
				logger.info("Authenticated User with userId " + credentials.getUserId());
				return new UserInfo(user.get());
			} else {
				logger.info("Invalid password for UserId " + credentials.getUserId());
				throw new InvalidPasswordException("Invalid password for UserId " + credentials.getUserId());
			}
		} else {
			logger.info("User not found with UserId " + credentials.getUserId());
			throw new UserNotFoundException("User not found with UserId " + credentials.getUserId());
		}
	}

	@Override
	public UserInfo authenticateAdmin(Credentials credentials) {
		Optional<User> user = userRepository.findById(credentials.getUserId());
		if(user.isPresent() && user.get().getUserType().equals("ADMIN")) {
			if(user.get().getPassword().equals(Encryption.passwordEncryptor(credentials.getPassword()))) {
				logger.info("Authenticated Admin with userId " + credentials.getUserId());
				return new UserInfo(user.get());
			} else {
				logger.info("Invalid password for UserId " + credentials.getUserId());
				throw new InvalidPasswordException("Invalid password for UserId " + credentials.getUserId());
			}
		} else {
			logger.info("User not found with UserId " + credentials.getUserId());
			throw new UserNotFoundException("User not found with UserId " + credentials.getUserId());
		}	
	}

}
