package com.project.MundriSoft.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.project.MundriSoft.models.User;



public interface UserRepo extends JpaRepository<User,Integer>{

	
	@Query("SELECT u FROM User u")
	List<User> findAllUsers();

	@Query("SELECT u FROM User u WHERE u.username = ?1 ")
	User findByUsername(String username); 

	
//	@Query("SELECT u FROM User u WHERE u.email = ?1")
//	User findByEmail(String email);

	
	
}
