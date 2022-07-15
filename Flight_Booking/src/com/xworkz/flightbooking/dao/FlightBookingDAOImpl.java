package com.xworkz.flightbooking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.flightbooking.dto.FlightBookingDTO;
import com.xwrokz.flightbooking.constatns.JdbcProperties;

import lombok.Getter;
import lombok.Setter;

public class FlightBookingDAOImpl implements FlightBookingDAO {

	@Override
	public boolean save(FlightBookingDTO dto) {
		
		String sql = "Insert into flightbooking values(?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),
				JdbcProperties.USERNAME.getValue(), JdbcProperties.SECRET.getValue())) {

			PreparedStatement prepare = connection.prepareStatement(sql);
			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getPassengerName());
			prepare.setBoolean(3, dto.isInternational());
			prepare.setString(4, dto.getPassportNo());
			prepare.setString(5, dto.getAirline());
			prepare.setString(6, dto.getBoarding());
			prepare.setString(7, dto.getDestination());
			prepare.setDouble(8, dto.getTicketPrice());
			//prepare.setTimestamp(9, dto.getTravelDateAndTime());
			prepare.setDouble(10, dto.getGstPercentage());
			prepare.setDouble(11, dto.getTotalPrice());

			int row = prepare.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
		public FlightBookingDAOImpl() {
			System.out.println("create " + getClass().getSimpleName());
		}

}
