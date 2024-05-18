package com.demo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.crud.models.User;

public interface LoginRepo extends JpaRepository<User,Integer>{

	@Query("SELECT u FROM User u WHERE u.username=?1 AND u.password=?2")
	public User findByMail(String username,String password);
}
