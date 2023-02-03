package com.xworkz.profile.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer  {

	private Class [] configurationClass = { SpringConfiguration.class };
	private String[] mapping = { "/" };
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("creating root configuration");
		return configurationClass;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("create mapping");
		return mapping;
	}

}
