package com.xworkz.bakeryitems;

import javax.servlet.annotation.WebServlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@WebServlet(urlPatterns = "/add")
public class BakeryServlet extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.do"};
	}

}
