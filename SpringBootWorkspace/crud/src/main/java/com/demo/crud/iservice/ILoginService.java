package com.demo.crud.iservice;

import java.util.List;

import com.demo.crud.models.User;

public interface ILoginService {

//	List<User> getAllUsers();
//	
//	User searchUserById(int d);
	
	User login(String username, String password); //Take login credentials according to your project
}
