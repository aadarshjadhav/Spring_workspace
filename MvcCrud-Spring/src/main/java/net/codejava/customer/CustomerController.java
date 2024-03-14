package net.codejava.customer;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {
	
//	ArrayList<Customer> list= new ArrayList<>();

	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/")
	public String indexPage()
	{
		System.out.println("inside Indexpage");
		
		return "redirect:/showcustomerslist";
	}
	
	@RequestMapping("/addcustomer")
	public String addCustomerform()
	{
		return "addcustomer";
	}
	

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String registerCustomer(@ModelAttribute("customer") Customer cus) {
		
		
		System.out.println("Customer Saved"+cus);
		
		customerservice.save(cus);
		
		return "redirect:/showcustomerslist";
	}
	
	@RequestMapping("/showcustomerslist")
    public ModelAndView showCustomer() {
         List<Customer> custlist= customerservice.listAll();
         ModelAndView mv= new ModelAndView();
         mv.setViewName("showcustomers");
         mv.addObject("clist",custlist);
      return mv;
    }
	
	
//	@RequestMapping("/showcustomerslist")
//	public String showCustomers()
//	{
//	//	return  new ModelAndView("showcustomers","list",list);
//		return  "showcustomers";
//
//	}
	


//	@RequestMapping(value="/save",method=RequestMethod.POST)
//	public String registerCustomer(@ModelAttribute Customer cus) {
//		
//		
//		System.out.println("Customer Saved"+cus);
		// list.add(cus);
//		System.out.println("customer"+cus);
//		model.addAttribute("cus",cus);
		
//		System.out.println("list:"+list);
//		model.addAttribute("list",list);
//		
//		
//		return "addcustomer";
//	}
}
