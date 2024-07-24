package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonConnection {
	
	public static Connection getConnection() throws SQLException {
		
		//class load
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//create connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DEMO","root","root1234");

		return con;
		
		
	}

}
