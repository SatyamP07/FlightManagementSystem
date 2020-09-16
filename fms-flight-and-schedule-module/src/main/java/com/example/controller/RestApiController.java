package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.service.UserService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/flight/schedule")
public class RestApiController {
	@Autowired
	UserService userService;
}
