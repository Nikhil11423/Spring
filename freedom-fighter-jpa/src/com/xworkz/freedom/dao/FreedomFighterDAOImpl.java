package com.xworkz.freedom.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.freedom.entity.FreedomFighterEntity;

import static com.xworkz.freedom.util.EMFactory.*;

public class FreedomFighterDAOImpl implements FreedomFighterDAO {

	private EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(FreedomFighterEntity entity) {

		try {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {

		}
		return true;
	}

	@Override
	public boolean addAll(List<FreedomFighterEntity> entity) {
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (FreedomFighterEntity freedomFighterEntity : entity) {
				manager.persist(freedomFighterEntity);
			}

			tx.commit();
			// factory.close();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return FreedomFighterDAO.super.addAll(entity);
	}

	@Override
	public FreedomFighterEntity findByname(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object object = query.getSingleResult();
			if (object != null) {
				FreedomFighterEntity entity = (FreedomFighterEntity) object;
				return entity;
			} else {
				System.out.println("name is not found");
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return FreedomFighterDAO.super.findByname(name);
	}
}
