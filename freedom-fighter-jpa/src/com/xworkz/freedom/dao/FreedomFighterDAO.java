package com.xworkz.freedom.dao;

import java.util.List;

import com.xworkz.freedom.entity.FreedomFighterEntity;

public interface FreedomFighterDAO {

	boolean save(FreedomFighterEntity entity);

	default boolean addAll(List<FreedomFighterEntity> entity) {
		return false;
	}

	default FreedomFighterEntity findByname(String name) {
		return null;

	}
}
