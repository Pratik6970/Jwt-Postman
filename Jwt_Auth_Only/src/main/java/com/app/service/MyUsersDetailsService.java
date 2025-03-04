package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.pojos.User;
import com.app.repo.UserRepository;

@Service
public class MyUsersDetailsService implements UserDetailsService {
	
	
	
	@Autowired
	private UserRepository userRepo;
	
	public MyUsersDetailsService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       
		User users = userRepo.findByUsername(username);
		
		
		System.out.println(users);
		
		if(users==null)
		{
			System.out.println("User not found here");
			throw new UsernameNotFoundException("no user found here");
			
		}
		else
		{
			System.out.println("User found here");
		}
		
		return new UserPrincipal(users);
	}

}
