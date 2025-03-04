package com.app.controller;

import org.hibernate.boot.model.source.internal.hbm.AbstractEntitySourceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin("*")
public class HomeController {
	
	public HomeController() {
		System.out.println("HomeController called here");
	}
	
	@GetMapping("/")
	public String HomePage(HttpServletRequest request)
	{
		String id = request.getSession().getId();
		System.out.println(id);
		return "Welcome To Home Page"+id;
	}

}
