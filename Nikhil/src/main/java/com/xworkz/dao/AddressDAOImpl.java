package com.xworkz.dao;

import static com.xworkz.profile.util.EMFactory.getFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.entities.Address;

public class AddressDAOImpl  implements AddressDAO{
	 private EntityManagerFactory factory = getFactory();	
		
	
		
			@Override
			public boolean save(Address address) {
				 EntityManager entity =null;
				 try {
					 entity= factory.createEntityManager();
					 EntityTransaction tx= entity.getTransaction();
					 tx.begin();
					 entity.persist(entity);
					 tx.commit();
				 } catch (PersistenceException e) {
						e.printStackTrace();
					} finally {
						entity.close();
					}
				return true;}
}
