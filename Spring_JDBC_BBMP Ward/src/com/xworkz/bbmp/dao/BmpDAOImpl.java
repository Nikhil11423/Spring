package com.xworkz.bbmp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bbmp.dto.BbmpDTO;

@Component
public class BmpDAOImpl implements BbmpDAO {

	@Autowired
	private DataSource source;

	@Override
	public boolean save(BbmpDTO bbmpDTO) {

		String sql = "Insert into bbmp values(?,?,?,?,?,?,?,?)";

		try (Connection connection = source.getConnection()) {
			PreparedStatement prepare = connection.prepareStatement(sql);
			prepare.setInt(1, bbmpDTO.getId());
			prepare.setInt(2, bbmpDTO.getWardNo());
			prepare.setString(3, bbmpDTO.getWardName());
			prepare.setString(4, bbmpDTO.getCorporator());
			prepare.setString(5, bbmpDTO.getMla());
			prepare.setDouble(6, bbmpDTO.getBudget());
			prepare.setDouble(7, bbmpDTO.getSpent());
			prepare.setDouble(8, bbmpDTO.getReamning());

			int row = prepare.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
