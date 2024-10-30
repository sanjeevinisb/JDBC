package com.xworkz.bird.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BirdUpdate {

	public static void main(String[] args) {
		 String url = "jdbc:mysql://127.0.0.1:3306/bird";
		    String userName = "root";
		    String password = "Xworkzodc@123";
		    String updateQuery = "update bird_table set bird_name = 'Luna' WHERE id = 1";
			String updateQuery1 = "update bird_table set bird_name = 'Mango' WHERE id = 2";
			String updateQuery2 = "update bird_table set bird_name = 'Penny' WHERE id = 3";
			String updateQuery3 = "update bird_table set bird_name = 'Benny' WHERE id = 4";
			String updateQuery4 = "update bird_table set bird_name = 'Raven' WHERE id = 5";
			String updateQuery5 = "update bird_table set bird_name = 'Piper' WHERE id = 6";
			String updateQuery6 = "update bird_table set bird_name = 'Sammy' WHERE id = 7";
			String updateQuery7 = "update bird_table set bird_name = 'Nellie' WHERE id = 8";
			String updateQuery8 = "update bird_table set bird_name = 'Kiki' WHERE id = 9";
			String updateQuery9 = "update bird_table set bird_name = 'Freddie' WHERE id = 10";

			try (Connection connection = DriverManager.getConnection(url, userName, password))
			{
				Statement statement = connection.createStatement();

	            int value = statement.executeUpdate(updateQuery);
	            int value1 = statement.executeUpdate(updateQuery1);
				int value2 = statement.executeUpdate(updateQuery2);
				int value3 = statement.executeUpdate(updateQuery3);
				int value4 = statement.executeUpdate(updateQuery4);
				int value5 = statement.executeUpdate(updateQuery5);
				int value6 = statement.executeUpdate(updateQuery6);
				int value7 = statement.executeUpdate(updateQuery7);
				int value8 = statement.executeUpdate(updateQuery8);
				int value9 = statement.executeUpdate(updateQuery9);
				
				
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
