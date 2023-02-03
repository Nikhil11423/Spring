package com.xwprkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xworkz.model.User;

public class UserDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/xworkz-btm-march";
	private String Username = "root";
	private String password = "ranjitha@2000";

	private static final String Insert_Users_sql = "Insert Into login Values(?,?,?,?,?,?);";

	private static final String SELECT_USers_By_Id1 = "select id,name,email from users where id=?";
	private static final String SELECT_All_Users = "select * from users";
	private static final String Delete_USers_Sql = "delete from users where id =?;";
	private static final String Update_USers_Sql = "update users set anme = ? ,email=? where id=?;";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, Username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void insertUser(User user) throws SQLException{
	try(Connection connection =getConnection();
	PreparedStatement preparedStatement=connection.prepareStatement(Insert_Users_sql)){
	preparedStatement.setString(1, user.getName());
	preparedStatement.setString(2, user.getPhoto());
	preparedStatement.setString(3, user.getEmailId());
	preparedStatement.setString(4, user.getPassword());
	preparedStatement.setLong(5, user.getMobileNo());
	preparedStatement.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	
	public boolean updateUser(User user) throws Exception{
		boolean rowUpdated;
		try(Connection connection =getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(Update_USers_Sql)){
				preparedStatement.setString(1, user.getName());
				preparedStatement.setString(2, user.getPhoto());
				preparedStatement.setString(3, user.getEmailId());
				preparedStatement.setString(4, user.getPassword());
				preparedStatement.setLong(5, user.getMobileNo());
				preparedStatement.setLong(6, user.getId());

				rowUpdated = preparedStatement.executeUpdate()>0;
	}
		return rowUpdated;
}
	
public User selectUser(int id) throws SQLException {
	User user = null;
	try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_All_Users)) {

		preparedStatement.setInt(1, id);
		System.out.println(preparedStatement);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			String name = rs.getString("name");
			String photo = rs.getString("photo");
			String emailId = rs.getString("emailId");
			long mobileNo = rs.getLong("mobileNo");

			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return user;
}


public UserDAO() {
	super();
	// TODO Auto-generated constructor stub
}

public List<User> selectAllUsers(){
	List<User> list =new ArrayList<>();
	try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_All_Users)) {
		System.out.println(preparedStatement);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String photo = rs.getString("photo");
			String emailId = rs.getString("emailId");
			long mobileNo = rs.getLong("mobileNo");

			//list.add(new User(id, name, photo, emailId, mobileNo));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return list;
}
public boolean delectUser(int id) throws SQLException{
	boolean rowDeleted;
	try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Delete_USers_Sql)) {
		preparedStatement.setInt(1, id);
		rowDeleted =preparedStatement.executeUpdate() > 0;
	}
	return rowDeleted;
}
}
