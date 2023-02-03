package com.xworkz.register.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.register")
@EnableWebMvc
@EnableScheduling
public class SpringConfig implements WebMvcConfigurer {

	public SpringConfig() {
		System.out.println("From Spring Configuration Layer");
	}
	@Bean
	public JavaMailSenderImpl sender() {
		System.out.println("Running the Java MailSender");
		
		JavaMailSenderImpl impl = new JavaMailSenderImpl();
		impl.setUsername("nikhilbasan14@outlook.com");
		impl.setPassword("Nikhil1014");
		impl.setPort(587);
		impl.setHost("smtp-mail.outlook.com");

		Properties mailProperties = impl.getJavaMailProperties();
		mailProperties.put("mail.transport.protocol", "smtp");
		mailProperties.put("mail.smtp.auth", true);
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.debug", true);
		return impl;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	 configurer.enable();	
	}

}
