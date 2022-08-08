package com.xworkz.trafic_info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.xworkz.trafic_info.dto.TrafficDTO;
@Component
public class TrafficDAOImpl implements TrafficDAO {

	@Override
	public boolean save(TrafficDTO dto) {
		String sql = "INSERT INTO traffic_info VALUES (?,?,?,?)"; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm_march", "root","root")) {

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, dto.getVehicleRegNo());
			statement.setString(2, dto.getPlace());
			statement.setString(3, dto.getDateAndTime());
			statement.setString(4, dto.getViolation());
			
		

			int rows = statement.executeUpdate();
			System.out.println(rows);
			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return false;
	}


}
