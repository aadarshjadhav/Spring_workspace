package com.demo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.crud.models.User;

public interface UserRepo extends JpaRepository<User,Integer>{

	
	
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	  User findByMail(String username); 

}
