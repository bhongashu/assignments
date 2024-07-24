package com.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.common.CommonConnection;

public class GetAllEmployeeDetails {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con=CommonConnection.getConnection();
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from employee");
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			//int id=rs.getInt("id");
			String name=rs.getString(2);
			double salary=rs.getDouble(3);
			
			System.out.println(id+name+salary);
		}
		
		
		
		
	}

}
