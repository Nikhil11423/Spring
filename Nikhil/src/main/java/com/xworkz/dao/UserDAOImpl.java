package com.xworkz.dao;

import static com.xworkz.profile.util.EMFactory.getFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.entities.Address;
import com.xworkz.entities.Employee;



public class UserDAOImpl implements UserDAO{

      private EntityManagerFactory factory = getFactory();	
	
	@Override
	public boolean save(Employee employee, Address address) {
	 EntityManager entity =null;
	 try {
		 entity= factory.createEntityManager();
		 EntityTransaction tx= entity.getTransaction();
		 tx.begin();
		 entity.persist(employee);
		 tx.commit();
	 } catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entity.close();
		}
		return true;
	}

}
