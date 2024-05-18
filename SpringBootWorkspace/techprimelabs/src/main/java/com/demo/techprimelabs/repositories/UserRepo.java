package com.demo.techprimelabs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.techprimelabs.models.User;


public interface UserRepo extends JpaRepository<User,Integer>{

	
	
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	User findByUsername(String username); 
	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User findByEmail(String email);

}
