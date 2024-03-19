package com.demo.firstsb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wc")
public class WelcomeController {
	
	@GetMapping("/getme")
	public String welcome()
	{
		return "hello world";
	}

	@PostMapping("/save")
	public String saveData(String name)
	{
		System.out.println("name:"+name);
		return "Inside Save";
	}
	
	@PutMapping("/update")
	public String updateData()
	{
		return "Inside Update";
	}
	
	@DeleteMapping("/delete")
	public String deleteData()
	{
		return "Inside delete";
	}
}
