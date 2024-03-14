package com.config;

import java.io.IOException;
import java.util.ArrayList;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	ArrayList<Customer> list= new ArrayList<>();
	
	@RequestMapping("/")
	public ModelAndView indexPage()
	{
		System.out.println("inside model and view page");
		ModelAndView mv= new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping("/addcustomernow")
	public String registerpage() {
		
		return "addcustomer";
	}
	

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String registerCustomer(@ModelAttribute Customer cus, Model model) {
		
		
		list.add(cus);
		
//		System.out.println("customer"+cus);
//		model.addAttribute("cus",cus);
		
//		System.out.println("list:"+list);
//		model.addAttribute("list",list);
		
		return "addcustomer";
	}
	

	@RequestMapping("/showcustomerslist")
	public ModelAndView showCustomerlist() {
		
		return  new ModelAndView("showcustomers","list",list);
	}
	
}
