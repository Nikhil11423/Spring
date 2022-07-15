package com.xworkz.flightbooking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.flightbooking.constant.JdbcProperties;
import com.xworkz.flightbooking.dto.FlightBookingDTO;

public class FlightBookingDAOImpl implements FlightBookingDAO {

	@Override
	public boolean save(FlightBookingDTO flightBookingDTO) {

		String sql = "Insert into gadget values(?,?,?,?,?,?,?,?,?,?,?)";

		try (Connection connection = DriverManager.getConnection(JdbcProperties.URL.getValue(),
				JdbcProperties.USERNAME.getValue(), JdbcProperties.SECRET.getValue())) {

			// id,passengerName,international,passportNo,airline,boarding,destination,ticketPrice,
			// travelDateAndTime,gstPercentage,totalPrice
			PreparedStatement prepare = connection.prepareStatement(sql);
			prepare.setInt(1, flightBookingDTO.getId());
			prepare.setString(2, flightBookingDTO.getPassengerName());
			prepare.setBoolean(3, flightBookingDTO.isInternational());
			prepare.setString(4, flightBookingDTO.getPassportNo());
			prepare.setString(5, flightBookingDTO.getAirline());
			prepare.setString(6, flightBookingDTO.getBoarding());
			prepare.setString(7, flightBookingDTO.getDestnation());
			prepare.setDouble(8, flightBookingDTO.getTicketPrice());
			prepare.setTimestamp(9, flightBookingDTO.getTravelDateAndTime());
			prepare.setDouble(10, flightBookingDTO.getGstPercentage());
			prepare.setDouble(11, flightBookingDTO.getTotalPrice());

			int row = prepare.executeUpdate();
			System.out.println(row);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
