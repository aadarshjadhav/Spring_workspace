package com.demo.crud.iservice;

import java.util.List;

import com.demo.crud.models.User;

public interface IUserService{
	
	List<User> getAllUsers();
	User saveUser(User u);
	User updateUser(User u);
	void deleteUser(int d);
	User searchUserById(int d);

}
