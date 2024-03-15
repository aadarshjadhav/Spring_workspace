package net.codejava.customer;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {
	

	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/")
	public String indexPage()
	{
		System.out.println("inside Indexpage");
		
		return "redirect:/showcustomerslist";
	}
	
	
	@RequestMapping("/addcustomer")
	  public String addCustomer(Model model) {
	      model.addAttribute("customer", new Customer());
	      return "addcustomer";
	  }
	
	@RequestMapping("/edit")
	  public ModelAndView updateCustomer(@RequestParam int id) {
		Customer cus=customerservice.get(id);
		System.out.println("cus"+cus);
		
		ModelAndView mv= new ModelAndView();
        mv.setViewName("updatecustomer");
        mv.addObject("customer",cus);
        return mv;

	  }
	
	@RequestMapping("/deletecustomer")
	  public String deleteCustomer(@RequestParam int id) {
		customerservice.delete(id);
	      return "redirect:/showcustomerslist";
	  }
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String registerCustomer(@ModelAttribute("customer") Customer cus) {
		
		
		System.out.println("Customer Saved"+cus);
		
		customerservice.save(cus);
		
		return "redirect:/showcustomerslist";
	}
	
//	@RequestMapping("searchById")
//    public ModelAndView searchById(@RequestParam int custId) {
//      Customer cust = customerservice.get(custId);
//      ModelAndView mv = new ModelAndView();
//      mv.setViewName("showcustomer");
//      mv.addObject("customer", cust);
//      return mv;
//    }
	
	 @RequestMapping("/showcustomerslist")
	    public ModelAndView showCustomer(@RequestParam(required = false) Integer searchId) {
	        List<Customer> custlist=null;
	        
	        if (searchId != null) 
	        {
	            //if searchId is provided, retrieve only the customer with that ID
	        	int temp_id=(int)searchId;
	            
	        	if(temp_id !=0)
	        	{
		        	Customer searchedCustomer = customerservice.get(temp_id);
		            
		            System.out.println("searchedCustomer"+searchedCustomer);
		    
	                custlist = new ArrayList<>();
	                custlist.add(searchedCustomer);
	        	}
	           
	        } 
	        else 
	        {
	            // If searchId is not provided, retrieve all customers
	            custlist = customerservice.listAll();
	        }

	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("showcustomers");
	        mv.addObject("clist", custlist);
	        return mv;
	    }

}
