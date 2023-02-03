package com.xworkz.register.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoryUtil {

	private static EntityManagerFactory factory;

	public EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz.register");

	}

}
