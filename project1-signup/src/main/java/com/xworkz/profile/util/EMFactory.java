package com.xworkz.profile.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFactory {

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("creating util entityManagerFactory");
	}
}
