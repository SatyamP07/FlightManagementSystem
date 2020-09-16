package com.example.application.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.entities.User;
import com.example.application.model.UserInfo;
import com.example.application.service.UserService;

@RestController("/RegisterLogin")
public class RegisterLoginModuleController {

	Logger logger = LoggerFactory.getLogger(RegisterLoginModuleController.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<UserInfo> addUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.addUser(user));
	}
	
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<UserInfo> viewUser(@PathVariable("userId") Long userId) {
		return ResponseEntity.ok(userService.viewUser(userId));
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserInfo>> viewUser() {
		return ResponseEntity.ok(userService.viewUser());
	}
	
	@PutMapping("/updateUser/password")
	public ResponseEntity<UserInfo> updateUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.updateUser(user));
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<UserInfo> updateUser(@RequestBody UserInfo userInfo) {
		return ResponseEntity.ok(userService.updateUser(userInfo));
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable("userId") Long userId) {
		String userName = userService.deleteUser(userId);
		return ResponseEntity.ok("User " + userName + "deleted successfully.");
	}
	
	
}
