package com.xworkz.flightbooking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import org.springframework.stereotype.Component;

import com.xworkz.flightbooking.dto.FlightBookingDTO;
import com.xwrokz.flightbooking.constatns.JdbcProperties;

import lombok.Getter;
import lombok.Setter;
@Component
public class FlightBookingDAOImpl implements FlightBookingDAO {

	@Override
	public boolean save(FlightBookingDTO dto) {
		
		String sql = "INSERT INTO flight_booking Values(?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),
				JdbcProperties.USERNAME.getValue(), JdbcProperties.SECRET.getValue())) {
	
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getPassengerName());
			statement.setBoolean(3, dto.isInternational());
			statement.setString(4, dto.getPassportNo());
			statement.setString(5, dto.getAirline());
			statement.setString(6, dto.getBoarding());
			statement.setString(7, dto.getDestination());
			statement.setDouble(8, dto.getTicketPrice());
			java.util.Date date = Calendar.getInstance().getTime();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			statement.setDate(9, sqlDate);
			statement.setDouble(10, dto.getGstPercentage());
			statement.setDouble(11, dto.getTotalPrice());
			
			int row=statement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
