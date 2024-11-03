package com.wmsoftware.cefetsis.controller;

import com.wmsoftware.cefetsis.model.User;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wmsoftware.cefetsis.service.UserService;

@RequestMapping("/userModule")
@RestController
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/findAll")
	public List<User> findAllClient(){
		return userService.findAll();
	}
	
	@GetMapping("/user/{Id}")
	public ResponseEntity<User> findById(Long Id){
		return userService.findById(Id);
	}
	
	@PostMapping("/register")
	public User register(User user){
		return userService.register(user);
	}
}
