package com.example.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.User;
import com.example.application.model.Credentials;
import com.example.application.model.UserInfo;

@Service
public interface UserService {

	UserInfo addUser(User user);
	UserInfo viewUser(Long userId);
	List<UserInfo> viewUser();
	UserInfo updateUser(User user);
	UserInfo updateUser(UserInfo userInfo);
	String deleteUser(Long userId);
	UserInfo authenticateUser(Credentials credentials);
	UserInfo authenticateAdmin(Credentials credentials);
}
