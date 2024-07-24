package com.preparedstatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.common.CommonConnection;

public class GetEmployeeDetails {

	public static void getAllEmployees() throws SQLException {
		
		Connection con=CommonConnection.getConnection();
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from employee");
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			String name=rs.getString(2);
			Double sal=rs.getDouble(3);
			System.out.println(id+" "+name+" "+sal);
		}
	}

}
