package com.xworkz.personaldetails.dao;

import static com.xworkz.personaldetails.util.EMFactory.getFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.xworkz.personaldetails.entity.PersonalDetailsEntity;

@Component
public class PersonalDetailsDAOImpl implements PersonalDetailsDAO {
	
	private EntityManagerFactory factory = getFactory();


	@Override
	public boolean save(PersonalDetailsEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	
}
}

