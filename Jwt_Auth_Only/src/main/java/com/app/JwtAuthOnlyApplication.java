package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthOnlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthOnlyApplication.class, args);
		
		System.out.println("Hi");
	}

}
