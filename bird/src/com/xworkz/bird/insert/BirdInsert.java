package com.xworkz.bird.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BirdInsert {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/bird";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into bird_table values (1,'Tweety','Canary')";
		String insertQuery1 = "insert into bird_table values (2,'Polly','Parrot')";
		String insertQuery2 = "insert into bird_table values (3,'Chirpy','Sparrow')";
		String insertQuery3 = "insert into bird_table values (4,'Flappy','Blue Jay')";
		String insertQuery4 = "insert into bird_table values (5,'Bella','Robin')";
		String insertQuery5 = "insert into bird_table values (6,'Sunny','Goldfinch')";
		String insertQuery6 = "insert into bird_table values (7,'Jack','Crow')";
		String insertQuery7 = "insert into bird_table values (8,'Gus','Pigeon')";
		String insertQuery8 = "insert into bird_table values (9,'Wendy','Woodpecker')";
		String insertQuery9 = "insert into bird_table values (10,'Coco','Cockatoo')";
		String insertQuery10 = "insert into bird_table values (11,'Misty','Dove')";
		String insertQuery11 = "insert into bird_table values (12,'Rusty','Red-tailed Hawk')";
		String insertQuery12 = "insert into bird_table values (13,'Nina','Hummingbird')";
		String insertQuery13 = "insert into bird_table values (14,'Charlie','Finch')";
		String insertQuery14 = "insert into bird_table values (15,'Pecky','Chickadee')";
		String insertQuery15 = "insert into bird_table values (16,'Zara','Falcon')";
		String insertQuery16 = "insert into bird_table values (17,'Ollie','Owl')";
		String insertQuery17 = "insert into bird_table values (18,'Daisy','Duck')";
		String insertQuery18 = "insert into bird_table values (19,'Sandy','Sandpiper')";
		String insertQuery19 = "insert into bird_table values (20,'Jasper','Kingfisher')";
		
 
		try (Connection connection = DriverManager.getConnection(url, userName, password))
		{
			Statement statement = connection.createStatement();

            int value = statement.executeUpdate(insertQuery);
            int value1 = statement.executeUpdate(insertQuery1);
			int value2 = statement.executeUpdate(insertQuery2);
			int value3 = statement.executeUpdate(insertQuery3);
			int value4 = statement.executeUpdate(insertQuery4);
			int value5 = statement.executeUpdate(insertQuery5);
			int value6 = statement.executeUpdate(insertQuery6);
			int value7 = statement.executeUpdate(insertQuery7);
			int value8 = statement.executeUpdate(insertQuery8);
			int value9 = statement.executeUpdate(insertQuery9);
			int value10 = statement.executeUpdate(insertQuery10);
            int value11 = statement.executeUpdate(insertQuery11);
			int value12 = statement.executeUpdate(insertQuery12);
			int value13 = statement.executeUpdate(insertQuery13);
			int value14 = statement.executeUpdate(insertQuery14);
			int value15 = statement.executeUpdate(insertQuery15);
			int value16 = statement.executeUpdate(insertQuery16);
			int value17 = statement.executeUpdate(insertQuery17);
			int value18 = statement.executeUpdate(insertQuery18);
			int value19 = statement.executeUpdate(insertQuery19);
			
			
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
