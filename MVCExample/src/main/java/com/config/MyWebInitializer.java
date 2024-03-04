package com.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/*WebApplicationInitializer registers a Spring DispatcherServlet and 
 *creates a Spring web application context.
 *  Traditionally, Java Web Applications based on Servlets were using the web.xml file to configure a
 *   Java Web Application. Since Servlet 3.0, 
 * web applications can be created programmatically via Servlet context listeners.*/

public class MyWebInitializer implements WebApplicationInitializer{
	
	
	public void onStartup(ServletContext container) throws ServletException {
		System.out.println("1");
		// TODO Auto-generated method stub
		 // Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(MvcConfiguration.class);
		ctx.setServletContext(container);

		
		//DispatcherServlet -> this act as a FrontController in Spring MVC 
		//  // Register and map the dispatcher servlet

		ServletRegistration.Dynamic servlet = container.addServlet(
				"dispatcher", new DispatcherServlet(ctx));

		//The load-on-startup element of web-app loads the servlet at the time of deployment or server start if value is positive. It is also known as pre initialization of servlet.

		//You can pass positive and negative value for the servlet.
		//As you know well, servlet is loaded at first request. That means it consumes more time at first request. 
		//If you specify the load-on-startup in web.xml, servlet will be loaded at project deployment time or server start. 
		//So, it will take less time for responding to first request.
		//If you pass the positive value, the lower integer value servlet will be loaded before 
		//the higher integer value servlet. In other words, container loads the servlets in ascending integer value.
		//The 0 value will be loaded first then 1, 2, 3 and so on.
		//If you pass the negative value, servlet will be loaded at request time, at first request.


		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		System.out.println("2");
	}	

}
