package com.xworkz.armydetails.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.xworkz.armydetails")
public class SpringConfiguration {

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUrl("jdbc:mysql://localhost:3306/xworkz_btm_march");
		data.setUsername("root");
		data.setPassword("root");

		return data;

	}

}
