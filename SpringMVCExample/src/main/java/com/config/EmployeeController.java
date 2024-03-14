package com.config;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("employeec")
public class EmployeeController {

	
	@RequestMapping("/register")
	public String registerpage() {
		
		return "addemployee";
	}
	
//	//Case1
//	@RequestMapping("/save")
//	public String saveEmployee(HttpServletRequest request)
//	{
//		System.out.println("inside employee save method");
//		
//		int id=Integer.parseInt(request.getParameter("empid"));
//		String name=request.getParameter("empname");
//		double salary=Double.parseDouble(request.getParameter("empsal"));
//		
//		System.out.println("--Employee Form--");
//		System.out.println("Id:"+id);
//		System.out.println("Name:"+name);
//		System.out.println("Salary:"+salary);		
//		
//		return "addemployee";
//	}
	
	//case2
//	  @RequestMapping("/save")
//	  public String saveEmployee(@RequestParam("empid")int id, @RequestParam("empname")String name,
//	      @RequestParam("empsal")double sal, Model model) {
//	    System.out.println("Inside employee save method");
//	    
//	    System.out.println("--Employee Form---");
//	    System.out.println("Id:"+id);
//	    System.out.println("Name:"+name);
//	    System.out.println("Salary:"+sal);
//	    
//	    model.addAttribute("id", id);
//	    model.addAttribute("name", name);
//	    model.addAttribute("sal", sal);
//	    return "employeelist";
//	  }
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute Employee emp, Model model)
	{
		System.out.println("empoyee"+emp);
		model.addAttribute("emp",emp);
		return "employeelist";
	}
//	
	@RequestMapping("/showemp")
	public ModelAndView showemployeedetailsPage()
	{
		System.out.println("inside showemployeedetails page");

		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("Aadarsh",25,20000));
		emplist.add(new Employee("Shudarshana",23,90000));
		emplist.add(new Employee("Yogesh",29,29000));
		
		return new ModelAndView("list","emp",emplist);
	}
}
