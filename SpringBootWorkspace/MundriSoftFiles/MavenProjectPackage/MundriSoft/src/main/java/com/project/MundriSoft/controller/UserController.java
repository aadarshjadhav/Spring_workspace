package com.project.MundriSoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.project.MundriSoft.iservice.IUserService;
import com.project.MundriSoft.models.User;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/user_info")
public class UserController {

	@Autowired
	private IUserService userservice;
	
	@GetMapping("/getallUsers")
	public List<User> getAllUsers()
	{
		return userservice.getAllUsers();
	}

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User u)
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
	
	@PutMapping("/updateUserInfo")
	  public User updateUserInfo(@RequestBody User u) {
	    User res=null;
	    System.out.println("inside UserInfo");
	    
	    try {
	      res=userservice.updateUser(u);
	      System.out.println("user updated");
	    }catch(Exception ex) {
	      System.out.println(ex.getMessage());
	    }
	    return res;
	  }
	

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable int id)
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
	

	@GetMapping("/searchUserById/{id}")
    public ResponseEntity<User> searchProductById(@PathVariable int id) {
		User user = userservice.searchUserById(id);
        return ResponseEntity.ok(user);
    }
	
	// Login endpoint
		@PostMapping("/login")
		public ResponseEntity<?> login(@RequestBody User user) {
		    System.out.println("Inside UserController PostMapping Login");
		    User user1 = userservice.authentication(user.getUsername(), user.getPass_word());
		    if (user1 != null) 
		    {
		    	System.out.println("Got the User :" +user1.getUsername() +" Pass_word" +user1.getPass_word());
		        // Authentication successful, return JSON object with success status
		        return ResponseEntity.ok().body("{\"status\": \"success\", \"message\": \"Login successful\",\"userRole\": \"" + user1 + "\"}");
		    } 
		    else 
		    {
		        
		        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"status\": \"error\", \"message\": \"Invalid username or password\"}");
		    }
		}

	
	
}
