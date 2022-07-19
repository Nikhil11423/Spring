package com.xworkz.armydetails.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.armydetail.excepetion.InvalidDataException;
import com.xworkz.armydetails.dao.ArmyDetailsDAO;
import com.xworkz.armydetails.dto.ArmyDetailsDTO;

import lombok.ToString;

@Component
@ToString
public class ArmyDetailsServiceImpl implements ArmyDetailsService {
	@Autowired
	private ArmyDetailsDAO dao;

	@Override
	public boolean validateAndSave(ArmyDetailsDTO dto) throws InvalidDataException {

		if (dto != null) {
			int id = dto.getId();
			String name = dto.getName();
			LocalDate founded = dto.getFounded();
			String country = dto.getCountry();
			String type = dto.getType();
			int active = dto.getActivePerson();
			int reserve = dto.getReservePerson();
			String motto = dto.getMotto();
			String chief = dto.getCommamder_in_Chief();
			String army = dto.getChief_of_Army_Staff();
			String voice = dto.getVoicechief_of_Army_Staff();
			String headquaters = dto.getHeadquaters();

			if (name != null && name.length() > 4 && name.length() < 40) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Name is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (country != null && country.length() > 3 && country.length() < 40) {
				System.out.println("Country is valid");
			} else {
				System.out.println("Country is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (type != null && type.length() > 3 && type.length() < 40) {
				System.out.println("Type is valid");
			} else {
				System.out.println("Type is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (motto != null && motto.length() > 4 && motto.length() < 100) {
				System.out.println("Motto is valid");
			} else {
				System.out.println("Motto is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (chief != null && chief.length() > 4 && chief.length() < 40) {
				System.out.println("Commamder_in_Chief name is valid");
			} else {
				System.out.println("Commamder_in_Chief name is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (army != null && army.length() > 4 && army.length() < 40) {
				System.out.println("Chief_of_Army_Staff name is valid");
			} else {
				System.out.println("Chief_of_Army_Staff name is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (voice != null && voice.length() > 4 && voice.length() < 40) {
				System.out.println("VoiceChief_of_Army_Staff name is valid");
			} else {
				System.out.println("VoiceChief_of_Army_Staff name is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (headquaters != null && headquaters.length() > 4 && headquaters.length() < 40) {
				System.out.println("Headquaters is valid");
			} else {
				System.out.println("Headquaters is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (active > 0 && active < 1500000) {
				System.out.println("ActivePerson is valid");
			} else {
				System.out.println("ActivePerson is invalid");
				throw new InvalidDataException("Enter the valid data");

			}
			if (reserve > 0 && reserve < 1000000) {
				System.out.println("ReservePerson is valid");
			} else {
				System.out.println("ReservePerson is invalid");
				throw new InvalidDataException("Enter the valid data");

			}

			boolean saved = dao.save(dto);
			return saved;

		}
		return false;
	}

}
