package com.project.MundriSoft.iservice;

import java.util.List;

import com.project.MundriSoft.models.User;


public interface IUserService {

	List<User> getAllUsers();
	User saveUser(User u);
	User updateUser(User c);
	void deleteUser(int id);
	User searchUserById(int id);
	User authentication(String email, String password);

	
//	void deleteUser(int d);
//	User searchUserById(int d);
//	User authenticate(String email, String password);

	
}
