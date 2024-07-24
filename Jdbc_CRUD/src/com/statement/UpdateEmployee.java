package com.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.common.CommonConnection;

public class UpdateEmployee {

	public static void main(String[] args) throws SQLException {
		
		Connection con=CommonConnection.getConnection();
		
		
		System.out.println(con);
		
		Statement stm=con.createStatement();
		
		int count=stm.executeUpdate("update employee set salary=3000 where ENAME='sam'");
		
		System.out.println(count +" "+"records updated successfully...");

	}

}
