package com.xworkz.personaldetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.profile")
@EnableWebMvc
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("create spring configurtion");
	}

}
