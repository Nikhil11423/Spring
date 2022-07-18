package com.xworkz.recharge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.recharge.dto.RechargeDTO;

@Component
public class RechargeDAOImpl implements RechargeDAO{
	
	@Autowired
	public DataSource datasource;

	@Override
	public boolean save(RechargeDTO dto) {

		String sql ="insert into recharge values(?,?,?,?,?,?,?)";
		
		try(Connection connection = datasource.getConnection()){
		
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setDouble(3, dto.getDiscount());
			statement.setDouble(4, dto.getCash());
			statement.setString(5, dto.getCode());
			statement.setInt(6, dto.getValidity());
			statement.setBoolean(7, dto.isFree());

			
			int row=statement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;	
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	

}
