package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration is a class-level annotation indicating that an object is a source of 
//bean definitions.
//@Configuration classes declare beans through @Bean-annotated methods.


@Configuration
@ComponentScan(basePackages="com.config")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{
	
	//@Bean is a method-level annotation and a direct analog of the XML <bean/> element. 
		//To declare a bean, simply annotate a method with the @Bean annotation. When JavaConfig encounters such a method, it will execute that method and register the return value as a bean within a BeanFactory. By default, the bean name will be the same 
		//as the method name (see bean naming for details on how to customize this behavior).
		
		@Bean
		public ViewResolver getViewResolver(){
			System.out.println("3");
			InternalResourceViewResolver resolver = new InternalResourceViewResolver();
			resolver.setPrefix("/WEB-INF/views/");
			resolver.setSuffix(".jsp");
			System.out.println("4");
			return resolver;
			
		}

}

