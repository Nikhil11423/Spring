package com.xworkz.ott.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.ott")
@EnableWebMvc
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Creating To Configuration is successfully");
	}

//	@Bean
//	public DataSource datasource() {
//
//		DriverManagerDataSource data = new DriverManagerDataSource("jdbc:mysql://localhost:3306/xworkz_btm_march", "root",
//				"root");
//		return data;
//
//	}
//	
}
