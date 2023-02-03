package com.xworkz.freedom.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freedom.dao.FreedomFighterDAO;
import com.xworkz.freedom.dao.FreedomFighterDAOImpl;
import com.xworkz.freedom.entity.FreedomFighterEntity;

import lombok.AllArgsConstructor;

public class FreedomFighterRunner {

	public static void main(String[] args) {

		FreedomFighterEntity entity = new FreedomFighterEntity("Srinath", LocalDateTime.now(), "Srinath",
				LocalDateTime.now(), "Bhagat singh ", "Banga", LocalDate.of(1907, 9, 28), LocalDate.of(1931, 3, 23),
				"male");
		FreedomFighterEntity entity1 = new FreedomFighterEntity("Srinath", LocalDateTime.now(), "Srinath",
				LocalDateTime.now(), "Gndhiji ", "Banga", LocalDate.of(1907, 9, 28), LocalDate.of(1931, 3, 23), "male");
		FreedomFighterEntity entity2 = new FreedomFighterEntity("Srinath", LocalDateTime.now(), "Srinath",
				LocalDateTime.now(), "Balagangdara tilak ", "Banga", LocalDate.of(1907, 9, 28),
				LocalDate.of(1931, 3, 23), "male");
		FreedomFighterEntity entity3 = new FreedomFighterEntity("Srinath", LocalDateTime.now(), "Srinath",
				LocalDateTime.now(), "sangoli rayanna", "Banga", LocalDate.of(1907, 9, 28), LocalDate.of(1931, 3, 23),
				"male");

		FreedomFighterDAO dao = new FreedomFighterDAOImpl();
//		 boolean entity1= dao.save(entity);
//		 System.out.println(entity1);
		List<FreedomFighterEntity> entities = new ArrayList<>();
		entities.add(entity);
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);

		// dao.addAll(entities);

		FreedomFighterEntity entity4 = dao.findByname("sangoli rayanna");
		System.out.println(entity4);
	}

}
