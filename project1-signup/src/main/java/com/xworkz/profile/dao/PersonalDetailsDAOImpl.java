//package com.xworkz.profile.dao;
//
//import static com.xworkz.profile.util.EMFactory.getFactory;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.PersistenceException;
//
//import com.xworkz.profile.personal.PersonalEntity;
//
//public class PersonalDetailsDAOImpl  implements PersonalDetailsDAO{
//
//	private EntityManagerFactory factory = getFactory();
//	
//	@Override
//	public boolean save(PersonalEntity personalEntity) {
//		EntityManager manager = null;
//		try {
//			manager = factory.createEntityManager();
//			EntityTransaction tx = manager.getTransaction();
//			tx.begin();
//			manager.persist(personalEntity);
//			tx.commit();
//
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//		} finally {
//			manager.close();  
//		}
//		return true;
//	}
//
//	
//
//}
