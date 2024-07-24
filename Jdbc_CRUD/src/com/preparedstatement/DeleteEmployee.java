package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.common.CommonConnection;

public class DeleteEmployee {

	public static void deleteExistingEmployee() throws SQLException {
		
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
		
		System.out.println("Enter employee id which you want to delete");
		int id=sc.nextInt();
		
		PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
			
		ps.setInt(1, id);
		
		int count=ps.executeUpdate();
		
		System.out.println(count+"Records deleted successfully");
		
		con.close();
	
		
	}

}
