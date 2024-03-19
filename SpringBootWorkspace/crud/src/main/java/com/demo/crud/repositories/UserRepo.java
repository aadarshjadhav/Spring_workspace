package com.demo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crud.models.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
