package com.preparedstatement;

import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.Get all Employee Details");
		System.out.println();
		
		System.out.println("Enter your choice");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int choice=scanner.nextInt();
			
			switch(choice) {
			
			case 1: AddEmployee.insertNewEmployee();
			
			case 2: UpdateEmployee.updateExistingEmployee();
			
			case 3: DeleteEmployee.deleteExistingEmployee();
			
			case 4: GetEmployeeDetails.getAllEmployees();
			
			}
		}

	}

}
