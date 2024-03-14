package com.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	// case 1
//	@RequestMapping("/")
//	public String indexPage() {
//		return "index"; // view page
//	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "home"; // view page
	}
	
	//Model is an interface present in com.springframework.ui pack
	//it is used for transferring data/attribute from business logic to view
	//used addAttribute(key,value) method having key and value pair 
	// case 2
//	@RequestMapping("/data")
//	public String dataPage(Model m) {
//		
//		m.addAttribute("name","Aadarsh");
//		m.addAttribute("age",12);
//		return "data"; // view page
//	}
	
	
	//case 3
	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		System.out.println("inside model and view page");
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	//case 4
	@RequestMapping("/data")
	public ModelAndView dataPage()
	{
		System.out.println("inside model and view page");
		
		//case 4.1
//		ModelAndView mv= new ModelAndView();
//		mv.addObject("name", "Aadarsh");
//		mv.addObject("age", 25);
//		mv.setViewName("data");
//		return mv;
		
//		return new ModelAndView("data", "name", "Suraj Dhokle");
		
		//case 4.3
		Person p = new Person();
		p.setName("Sudharshan");
		p.setAge(99);
		p.setEmail("Ram Krishna Harhe");
		return new ModelAndView("data","person",p);
	}
	


	@RequestMapping("/showemployeedetails")
	public ModelAndView showemployeedetailsPage()
	{
		System.out.println("inside showemployeedetails page");

		
		//case 4.3
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Aadarsh",25,20000));
		list.add(new Employee("Shudarshana",23,90000));
		list.add(new Employee("Yogesh",29,29000));
		
		return new ModelAndView("showemployeedetails","emplist",list);
	}
	
	
	

}


