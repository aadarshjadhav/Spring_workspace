package com.demo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.iservice.ILoginService;
import com.demo.crud.models.User;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/login")
public class CrudControllerLogin {
	
	@Autowired
	private ILoginService loginservice;
	
	@PostMapping("/signin")
	public void login(@RequestBody User u)
	{
		User user=loginservice.login(u.getUsername(), u.getPassword()); //Take login credentials according to your project. Mine is username
		System.out.println("username:"+user.getUsername()+"password:"+user.getPassword());
	}

}
