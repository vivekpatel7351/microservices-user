package com.lcwd.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//create user
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User saveUser = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
	}
	
	//get all user
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		  List<User> allUser = userService.getAllUser();
		 return ResponseEntity.ok(allUser);
	}
	
	//get single user
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId){
		  User user = userService.getUser(userId);
		 return ResponseEntity.ok(user);
	}

}
