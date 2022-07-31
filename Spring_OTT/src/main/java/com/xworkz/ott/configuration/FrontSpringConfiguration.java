package com.xworkz.ott.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontSpringConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	private Class[]  config= {SpringConfiguration.class};
	private String[] mapping = {"*.do"};
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return config;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return mapping;
	}

}
