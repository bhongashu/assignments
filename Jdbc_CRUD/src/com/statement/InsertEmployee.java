package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployee {
	
	public static void main(String[] args) throws SQLException  {
		
		try {
			//loading of class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_DEMO","root","root1234");
		
		System.out.println(con);
		
		//create statement
		
		Statement stm=con.createStatement();
		
		//execute statement
		
		int count=stm.executeUpdate(("insert into employee values(2,'ram',2000)"));
		
		System.out.println(count+"records added successfully");
		
		con.close();
	}

}
