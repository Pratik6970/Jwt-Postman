package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println("UserController called here");
	}
	
	
	@PostMapping("/register")
	public User postUsersHere(@RequestBody User user)
	{
		return userService.postUser(user);
	}

	@PostMapping("/login")
	public String VerifyUsersHere(@RequestBody User user1)
	{
		return userService.verifiedUsers(user1);
	}

}
