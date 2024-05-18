package com.demo.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.crud.iservice.ILoginService;
//import com.demo.crud.iservice.ILoginService;
import com.demo.crud.models.User;
import com.demo.crud.repositories.LoginRepo;
import com.demo.crud.repositories.UserRepo;

@Service
public class LoginService implements ILoginService{
	
	@Autowired
	private LoginRepo loginrepo;

	@Override
	public User login(String username, String password) {

//		List<User> u=userrepo.findAll();
//		u.forEach();
		
		User u=loginrepo.findByMail(username,password);
		return u;
	}



}
