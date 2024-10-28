package com.xworkz.sandwich.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SandwichRunner {

	public static void main(String[] args) {
		
	String url = "jdbc:mysql://127.0.0.1:3306/sandwich";
	String userName = "root";
	String password = "Xworkzodc@123";
	String insertQuery = "insert into sandwich_table values (1,'Egg Sandwich','65Rs'),";

	Connection connection = null;

	try {
		connection = DriverManager.getConnection(url, userName, password);

		Statement statement = connection.createStatement();

		int value = statement.executeUpdate(insertQuery);

		if (value > 0) {

			System.out.println("This is saved");

		} else {

			System.out.println("This is not saved");
		}

	} catch (SQLException e) {

		e.printStackTrace();

	}
}
}
