package com.xworkz.profile.dao;

import static com.xworkz.profile.util.EMFactory.getFactory;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.xworkz.profile.entity.ProfileEntity;

@Component
public class ProfileDAOImpl implements ProfileDAO {

	private EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(ProfileEntity entity) {
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
		return true;
	}

	@Override
	public ProfileEntity findByUserId(String userId) {
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			Query query = entity.createNamedQuery("findByUserId");
			query.setParameter("us", userId);
			Object obj = query.getSingleResult();
			if (obj != null) {

				ProfileEntity result = (ProfileEntity) obj;
				return result;
			} else {
				System.err.println("Find br Name is not found for:" + userId);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entity.close();
		}
		return null;
	}

	@Override
	public ProfileEntity findByUserIdAndPassword(String userId, String password) {
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			Query query = entity.createNamedQuery("findByUserIdAndPassword");
			query.setParameter("ni", userId);
			query.setParameter("pass", password);
			Object obj = query.getSingleResult();
			if (obj != null) {

				ProfileEntity result = (ProfileEntity) obj;
				return result;
			} else {
				System.err.println("Find ur UserId and Password is not found for:" + userId + password);
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entity.close();
		}
		return null;
	}

	@Override
	public void UpdatePasswordByUserId(String password, String userId) {
		EntityManager entity = null;
		try {
			entity = factory.createEntityManager();
			EntityTransaction tx = entity.getTransaction();
			tx.begin();
			Query query = entity.createNamedQuery("updatePasswordByUserId");
			query.setParameter("pass", password);
			query.setParameter("us", userId);
			int obj = query.executeUpdate();
			System.out.println(obj);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entity.close();
		}
	}

	@Override
	public boolean generateOTP(String userId, String otp) {
		EntityManager otpEntity = null;
		try {
			otpEntity = factory.createEntityManager();
			EntityTransaction tx = otpEntity.getTransaction();
			tx.begin();
			Query query = otpEntity.createNamedQuery("updateOtpByUserId");
			query.setParameter("us", userId);
			query.setParameter("tp", otp);
			int obj = query.executeUpdate();
			System.out.println("OTP Generate is Succesfull" + obj);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			otpEntity.close();
		}
		return true;

	}

	@Override
	public ProfileEntity updateloginCountByUserId(Integer count, String userId) {
		EntityManager active = null;
		try {
			active = factory.createEntityManager();
			EntityTransaction tx = active.getTransaction();
			tx.begin();
			Query qurey = active.createNamedQuery("updateloginCountByUserId");
			qurey.setParameter("us", userId);
			qurey.setParameter("log", count);
			int obj = qurey.executeUpdate();
			System.out.println("Login Count is Working" + obj);
			tx.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			active.close();
		}
		return null;
	}

	@Override
	public void updateOtpGeneratedTimeByUserId(LocalDateTime dateTime,String userId) {
		EntityManager active = null;
		try {
			active = factory.createEntityManager();
			EntityTransaction tx = active.getTransaction();
			tx.begin();
			Query qurey = active.createNamedQuery("updateOtpGeneratedTimeByUserId");
			qurey.setParameter("otpgt", dateTime);
			qurey.setParameter("us", userId);
			int cd = qurey.executeUpdate();
			tx.commit();
			System.out.println(cd);
		} catch (PersistenceException e) {
			e.printStackTrace();
			active.getTransaction().rollback();
		} finally {
			active.close();
		}	
		ProfileDAO.super.updateOtpGeneratedTimeByUserId(dateTime, userId);
	}
	
	@Override
	public void updateOtpByScheduler(LocalDateTime dateTime) {
		EntityManager active = null;
		try {
			active = factory.createEntityManager();
			EntityTransaction tx = active.getTransaction();
			tx.begin();
			Query qurey = active.createNamedQuery("updateOtpByScheduler");
			qurey.setParameter("otpgt", dateTime);
			int ab = qurey.executeUpdate();
			tx.commit();
			System.out.println(ab);
		} catch (PersistenceException e) {
			e.printStackTrace();
			active.getTransaction().rollback();
		} finally {
			active.close();
		}
		ProfileDAO.super.updateOtpByScheduler(dateTime);
	}

}
