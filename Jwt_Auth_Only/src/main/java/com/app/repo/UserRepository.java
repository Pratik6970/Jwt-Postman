package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUsername(String username);

}
