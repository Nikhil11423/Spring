package com.xworkz.bakeryitems;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Spring Configuration is Successfully Done");
	}
	
}
