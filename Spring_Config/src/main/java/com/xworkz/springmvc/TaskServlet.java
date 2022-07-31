package com.xworkz.springmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TaskServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {SpringConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
      System.out.println("Create the web MVC");
		return new String[] {"/*.do"};
	}

	
}
