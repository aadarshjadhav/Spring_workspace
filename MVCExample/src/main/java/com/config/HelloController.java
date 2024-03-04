package com.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	

	@RequestMapping("/")
	public String homepage()
	{
		return "home";
	}
	
	
	@RequestMapping("/register")
	public String registerPage()
	{
		return "register";
	}
	
	@RequestMapping("/data")
	public String mydata(Model m)
	{
		m.addAttribute("username","Aadarsh J");
		m.addAttribute("age","25");
		return "data";
	}
	
	
}
