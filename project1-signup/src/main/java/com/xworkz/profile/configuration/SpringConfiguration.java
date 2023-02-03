package com.xworkz.profile.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.profile")
@EnableWebMvc
@EnableScheduling
//@PropertySource("classpath:mail.properties")
public class SpringConfiguration implements WebMvcConfigurer{

	public SpringConfiguration() {
		System.out.println("create spring configurtion");
	}

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		return resolver;

	}

	@Bean
	public JavaMailSenderImpl mailSender() {
		System.out.println("Running the Java MailSender");
		
		JavaMailSenderImpl impl = new JavaMailSenderImpl();
		impl.setUsername("nikhilbasan14@outlook.com");
		impl.setPassword("Nikhil1014");
		impl.setPort(587);
		impl.setHost("smtp.office365.com");

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
