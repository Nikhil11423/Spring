package com.xworkz.personaldetails.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer  {

	private Class[] configurationClass = { SpringConfiguration.class };
	private String[] mapping = { "*.do" };
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("creating root configuration");
		return configurationClass;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("create mapping");
		return mapping;
	}

}

