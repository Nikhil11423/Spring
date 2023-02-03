package com.xworkz.register.dao;

import com.xworkz.register.entity.ProfileEntity;

import java.sql.Connection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.apache.catalina.Session;
import org.hibernate.HibernateException;
import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileDAOImpl implements ProfileDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.register");

	@Override
	public boolean save(ProfileEntity entity) {

		System.out.println("From DAO Layer");
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return true;
	}

	@Override
	public ProfileEntity findByEmailId(String emailId) {
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			Query query = entity.createNamedQuery("findByEmailId");
			query.setParameter("us", emailId);
			Object obj = query.getSingleResult();
			if (obj != null) {

				ProfileEntity result = (ProfileEntity) obj;
				return result;
			} else {
				System.err.println("Find br Name is not found for:" + emailId);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entity.close();
		}
		return null;
	}

	@Override
	public ProfileEntity findByEmailIdAndPassword(String emailId, String Password) {
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			Query query = entity.createNamedQuery("findByEmailIdAndPassword");
			query.setParameter("us", emailId);
			query.setParameter("pass", Password);
			Object obj = query.getSingleResult();
			if (obj != null) {

				ProfileEntity result = (ProfileEntity) obj;
				return result;
			} else {
				System.err.println("Find ur UserId and Password is not found for:" + emailId + Password);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entity.close();
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ProfileEntity> getAllUserInfo() {
		List<ProfileEntity> list = null;
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			Query query = entity.createNamedQuery("getAllUserInfo");
			list = query.getResultList();
			System.out.println("profilrentity is working");
		} catch (Exception e) {
			e.printStackTrace();			
		}
		return list;
	}

	@Override
	public ProfileEntity deleteById(int id) {
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			entity.getTransaction().begin();
			Query query = entity.createNamedQuery("deleteById");
			query.setParameter("i", id);
			int result = query.executeUpdate();
			entity.getTransaction().commit();
			entity.close();
		}catch (TransactionException e) {
			e.printStackTrace();
		}
		return null;
	}

}	
