package com.xworkz.bakeryitems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.xworkz.bakeryitems.dto.BakeryDTO;
@Component
public class BakeryDAOImpl implements BakeryDAO {

	@Override
	public boolean save(BakeryDTO dto) {
		
		String sql = "INSERT INTO bakery_items VALUES (?,?,?,?,?)"; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException f) {
			f.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz_btm_march", "root",
		"root")) {

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, dto.getName());
			statement.setInt(2, dto.getPrice());
			statement.setDouble(3, dto.getQuantity());
			statement.setString(4, dto.getVendor());
			statement.setBoolean(5, dto.isVeg());
		

			int rows = statement.executeUpdate();
			System.out.println(rows);
			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	}

