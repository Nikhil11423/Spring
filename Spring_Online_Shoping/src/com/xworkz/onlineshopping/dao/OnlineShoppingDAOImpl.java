package com.xworkz.onlineshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.onlineshopping.dto.OnlineShoppingDTO;

@Component
public class OnlineShoppingDAOImpl implements OnlineShoppingDAO {

	@Autowired
	private DataSource dataSource;

	@Override
	public boolean save(OnlineShoppingDTO dto) {
		
		String sql = "insert into onlineshopping values(?,?,?,?,?,?,?,?)";

		try (Connection connection = dataSource.getConnection()) {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, dto.getId());
			preparedStatement.setString(2, dto.getProduct());
			preparedStatement.setDouble(3, dto.getPrice());
			preparedStatement.setString(4, dto.getType());
			preparedStatement.setInt(5, dto.getQuantity());
			preparedStatement.setString(6, dto.getPaymentMode());
			preparedStatement.setString(7, dto.getDiscount());
			preparedStatement.setInt(8, dto.getGstPercent());

			int row = preparedStatement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
