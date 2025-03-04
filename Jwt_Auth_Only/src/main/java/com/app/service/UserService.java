package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.pojos.User;

@Service
public class UserService {
	
	
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthenticationManager manager;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	public UserService() {
		System.out.println("UserService called here");
	}
	
	public User postUser(User user)
	{
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return user;
	}
	
	public String verifiedUsers(User user1)
	{
		Authentication authToken = manager.authenticate(new UsernamePasswordAuthenticationToken(user1.getUsername(), user1.getPassword()));
		
		if(authToken.isAuthenticated())
		{
			System.out.println("User is authenticated here");
			return jwtService.generateAccessToken(user1.getUsername());
		}
		else
		{
			System.out.println("No user is authenticated here");
			throw new UsernameNotFoundException("User is unauthenticated here");
		}
	}

}
