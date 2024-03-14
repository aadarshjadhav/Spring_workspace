package net.codejava.config;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * Servlet implementation class WebAppInitializer
 */
public class WebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		System.out.println("1-One");
		// TODO Auto-generated method stub
		 // Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext appcontext = new AnnotationConfigWebApplicationContext();
		appcontext.register(WebMvcConfig.class);

		
		//DispatcherServlet -> this act as a FrontController in Spring MVC 
		//  // Register and map the dispatcher dispatcher

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
				"SpringDispatcher", new DispatcherServlet(appcontext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		//The load-on-startup element of web-app loads the dispatcher at the time of deployment or server start if value is positive. It is also known as pre initialization of servlet.

		//You can pass positive and negative value for the dispatcher.
		//As you know well, dispatcher is loaded at first request. That means it consumes more time at first request. 
		//If you specify the load-on-startup in web.xml, dispatcher will be loaded at project deployment time or server start. 
		//So, it will take less time for responding to first request.
		//If you pass the positive value, the lower integer value dispatcher will be loaded before 
		//the higher integer value dispatcher. In other words, container loads the dispatcher in ascending integer value.
		//The 0 value will be loaded first then 1, 2, 3 and so on.
		//If you pass the negative value, dispatcher will be loaded at request time, at first request.


		
		System.out.println("2-Two");
	}
	

}
