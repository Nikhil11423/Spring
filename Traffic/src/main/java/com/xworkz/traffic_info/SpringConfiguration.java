package com.xworkz.traffic_info;

import javax.naming.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableAsync
@PropertySource("classpath:application.properties")
@ComponentScan("com.xworkz")
public class SpringConfiguration {


	
	public SpringConfiguration() {
		System.out.println("Create the Spring Configuration");
	}
	
	@Bean
	public ViewResolver viewResolver() {	
		System.out.println("Creating the View Resolver");
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;
	
	}
		
	
	
	

	

}