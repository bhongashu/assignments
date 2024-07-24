package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.common.CommonConnection;

public class AddEmployee {

	public static void insertNewEmployee() throws SQLException {
		
		Connection con=CommonConnection.getConnection();
		
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			ps.setInt(1, id);
			
			System.out.println("Enter name");
			String name=sc.next();
			ps.setString(2, name);
			
			System.out.println("Enter salary");
			Double sal=sc.nextDouble();
			ps.setDouble(3, sal);
		}
		
		int count=ps.executeUpdate();
		
		System.out.println(count+"Employee added successfully..");
		
		
	}

}
