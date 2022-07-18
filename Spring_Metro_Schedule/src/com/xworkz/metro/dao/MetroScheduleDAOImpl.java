package com.xworkz.metro.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.metro.dto.MetroScheduleDTO;
@Component
public class MetroScheduleDAOImpl implements MetroScheduleDAO {
	
    @Autowired
	private DataSource datasource;
	
	@Override
	public boolean save(MetroScheduleDTO dto) {
		
		String sql ="insert into metro values(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection = datasource.getConnection()){
		
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getStation());
			statement.setInt(3, dto.getPlatform());
			statement.setInt(4, dto.getTrainNo());
			java.util.Date date = new Date();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			statement.setDate(5, sqlDate);
			statement.setString(6, dto.getPassengerName());
			statement.setString(7, dto.getDestination());
			statement.setDouble(8, dto.getTicketPrice());
			statement.setDouble(9, dto.getDuration());


			
			int row=statement.executeUpdate();
			System.out.println(row);
			return row == 1 ? true : false;
	
			
			
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return false;
		
		
	
		}
	}

