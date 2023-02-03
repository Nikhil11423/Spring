package com.xworkz.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.constants.JDBCProperties;
import com.xworkz.registration.dto.RegistrationDTO;

public class RegistrationDAOImpl implements RegistrationDAO{
	
	@Override
	public boolean save(RegistrationDTO dto){
        String sql = "INSERT INTO Register VALUES(?, ?, ?, ?, ?,?,?)";
       try{Class.forName("com.mysql.cj.jdbc.Driver");
    	   
       }catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
        
        try (Connection connection = DriverManager.getConnection(JDBCProperties.URL.getValues(),
				JDBCProperties.USERNAME.getValues(), JDBCProperties.SECRET.getValues())) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, dto.getId());
            preparedStatement.setString(2,dto.getFirstName());
            preparedStatement.setString(3, dto.getMidelName());
            preparedStatement.setString(4,dto.getLastName());
            preparedStatement.setString(5, dto.getEmail());
            preparedStatement.setString(6, dto.getPassword());
            preparedStatement.setString(7,dto.getConfirmPassword());


            System.out.println(preparedStatement);
            int row = preparedStatement.executeUpdate();
            return row == 1 ? true:false;
            

        } catch (SQLException e) {
             e.printStackTrace();
 
        }
		return false;
    }

	

}
