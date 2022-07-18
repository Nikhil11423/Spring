package com.xworkz.armydetails.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.armydetails.dto.ArmyDetailsDTO;

@Component
public class ArmyDetailsDAOImpl implements ArmyDetailsDAO {

	@Autowired
	public DataSource dataSource;

	@Override
	public boolean save(ArmyDetailsDTO dto) {

		String sql = "Insert into armydetails values(?,?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = dataSource.getConnection()) {

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setDate(3, java.sql.Date.valueOf(dto.getFounded()));
			statement.setString(4, dto.getCountry());
			statement.setString(5, dto.getType());
			statement.setInt(6, dto.getActivePerson());
			statement.setInt(7, dto.getReservePerson());
			statement.setString(8, dto.getMotto());
			statement.setString(9, dto.getCommamder_in_Chief());
			statement.setString(10, dto.getChief_of_Army_Staff());
			statement.setString(11, dto.getVoicechief_of_Army_Staff());
			statement.setString(12, dto.getHeadquaters());

			int row = statement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

}
