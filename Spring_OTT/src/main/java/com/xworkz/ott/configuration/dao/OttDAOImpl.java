package com.xworkz.ott.configuration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.dto.OttDTO;
@Component
public class OttDAOImpl implements OttDAO {
	

//	@Autowired
//	private DataSource dataSource;
	

	@Override
	public boolean save(OttDTO dto) {

		String sql = "INSERT INTO ott VALUES (?,?,?,?,?,?,?)"; 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm_march", "root",
		"root")) {

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, dto.getName());
			statement.setString(2, dto.getRegion());
			statement.setString(3, dto.getLanguage());
			statement.setString(4, dto.getPack());
			statement.setInt(5, dto.getUser());
			statement.setInt(6, dto.getSince());
			statement.setBoolean(7, dto.isStatus());

			int rows = statement.executeUpdate();
			System.out.println(rows);
			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
