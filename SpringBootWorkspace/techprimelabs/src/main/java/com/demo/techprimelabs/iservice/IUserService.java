package com.demo.techprimelabs.iservice;

import java.util.List;

import com.demo.techprimelabs.models.User;

public interface IUserService {

	List<User> getAllUsers();
	User saveUser(User u);
	User updateUser(User u);
	void deleteUser(int d);
	User searchUserById(int d);
	User authenticate(String email, String password);

}
