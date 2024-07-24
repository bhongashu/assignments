package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.common.CommonConnection;

public class UpdateEmployee {

	public static void updateExistingEmployee() throws SQLException {
		
		Connection con=CommonConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from employee");
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			String name=rs.getString(2);
			Double sal=rs.getDouble(3);
			System.out.println(id+" "+name+" "+sal);
		}
		
		System.out.println("Enter employee id which you want to update");
		int id=sc.nextInt();
		
		PreparedStatement ps=con.prepareStatement("update employee set ename=?,salary=? where id=?");
			
		ps.setInt(3, id);
		
		System.out.println("Enter name");
		String name=sc.next();	
		ps.setString(1, name);
		
		System.out.println("Enter sal");
		Double sal=sc.nextDouble();	
		ps.setDouble(2, sal);
		
		ps.executeUpdate();
		
		con.close();
		
	}

}
