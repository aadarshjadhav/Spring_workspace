package com.demo.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.crud.iservice.IUserService;
import com.demo.crud.models.User;

@RestController
@RequestMapping("/user")
public class CrudControllerUser {
	
	@Autowired
	private IUserService userservice;
	
	@GetMapping("/getallUsers")
	public List<User> getAllUsers()
	{
		return userservice.getAllUsers();
	}

	@PostMapping("/saveUser")
	public User saveProduct(@RequestBody User u)
	{
		System.out.println("Inside saveUser");
		User res=null;

		try {
			res=userservice.saveUser(u);
			System.out.println("Save User Done");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@PutMapping("/updateUser")
	public User updateProduct(@RequestBody User u)
	{
		System.out.println("Inside updateUser");
		User res=null;

		try {
			res=userservice.updateUser(u);
			System.out.println("updateUser User Done");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return res;
	}
	

	@DeleteMapping("/deleteUser/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		try 
		{
			userservice.deleteUser(id);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	

	@GetMapping("/searchProductById/{id}")
    public ResponseEntity<User> searchProductById(@PathVariable int id) {
		User user = userservice.searchUserById(id);
        return ResponseEntity.ok(user);
    }
	

}

