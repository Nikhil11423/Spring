package com.xworkz.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class SpringConfiguration {

	public SpringConfiguration() {
	System.out.println("Create the SpringConfiguration");
	}
	
	

}
