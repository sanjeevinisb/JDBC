package com.xworkz.flower.runner;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FlowerRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/flower";
				String userName = "root";
				String password = "Xworkzodc@123";
				String insertQuery = "insert into flower_table values (1,'Sunflower','15Rs')";
				String insertQuery1 = "insert into flower_table values (2,'Rose','10Rs')";
				String insertQuery2 = "insert into flower_table values (3,'Iris','90Rs')";
				String insertQuery3 = "insert into flower_table values (4,'Orhid','100Rs')";
				String insertQuery4 = "insert into flower_table values (5,'Peony','35Rs')";
				String insertQuery5 = "insert into flower_table values (6,'Tulip','20Rs')";
				String insertQuery6 = "insert into flower_table values (7,'Carnation','50Rs')";
				String insertQuery7 = "insert into flower_table values (8,'Lily','65Rs')";
				String insertQuery8 = "insert into flower_table values (9,'Marigold','45Rs')";
				String insertQuery9 = "insert into flower_table values (10,'Dahila','60Rs')";
				String insertQuery10 = "insert into flower_table values (11,'Daffodil','80Rs')";
				String insertQuery11 = "insert into flower_table values (12,'Chrysanthemum','25Rs')";
				String insertQuery12 = "insert into flower_table values (13,'Daisy','40Rs')";
				String insertQuery13 = "insert into flower_table values (14,'Jasmine','50Rs')";
				String insertQuery14 = "insert into flower_table values (15,'Lavender','150Rs')";
				String insertQuery15 = "insert into flower_table values (16,'Aster','125Rs')";
				String insertQuery16 = "insert into flower_table values (17,'Anemone','145Rs')";
				String insertQuery17 = "insert into flower_table values (18,'Azalea','165Rs')";
				String insertQuery18 = "insert into flower_table values (19,'Amaryllis','90Rs')";
				String insertQuery19 = "insert into flower_table values (20,'Camellia','55Rs')";
				
				String updateQuery = "update flower_table set flower_name = 'Gardenia' WHERE id = 1";
				String updateQuery1 = "update flower_table set flower_name = 'Hibiscus' WHERE id = 2";
				String updateQuery2 = "update flower_table set flower_name = 'Periwinkle' WHERE id = 3";
				String updateQuery3 = "update flower_table set flower_name = 'Lotus' WHERE id = 4";
				String updateQuery4 = "update flower_table set flower_name = 'Chamomile' WHERE id = 5";
				String updateQuery5 = "update flower_table set flower_name = 'Bluebell' WHERE id = 6";
				String updateQuery6 = "update flower_table set flower_name = 'Geranium' WHERE id = 7";
				String updateQuery7 = "update flower_table set flower_name = 'Snowdrop' WHERE id = 8";
				String updateQuery8 = "update flower_table set flower_name = 'Poppy' WHERE id = 9";
				String updateQuery9 = "update flower_table set flower_name = 'Magnolia' WHERE id = 10";
					
				String deleteQuery1="delete from flower_table where id=11";
		        String deleteQuery2="delete from flower_table where id=12";
		        String deleteQuery3="delete from flower_table where id=13";
		        String deleteQuery4="delete from flower_table where id=14";
		        String deleteQuery5="delete from flower_table where id=15";
		        String deleteQuery6="delete from flower_table where id=16";
		        String deleteQuery7="delete from flower_table where id=17";
		        String deleteQuery8="delete from flower_table where id=18";
		        String deleteQuery9="delete from flower_table where id=19";
		        String deleteQuery10="delete from flower_table where id=20";

		 
				try (Connection connection = DriverManager.getConnection(url, userName, password))
				{
					Statement statement = connection.createStatement();
					int value1 = statement.executeUpdate(deleteQuery1);
					int value2 = statement.executeUpdate(deleteQuery2);
					int value3 = statement.executeUpdate(deleteQuery3);
					int value4 = statement.executeUpdate(deleteQuery4);
					int value5 = statement.executeUpdate(deleteQuery5);
					int value6 = statement.executeUpdate(deleteQuery6);
					int value7 = statement.executeUpdate(deleteQuery7);
					int value8 = statement.executeUpdate(deleteQuery8);
					int value9 = statement.executeUpdate(deleteQuery9);
					int value10 = statement.executeUpdate(deleteQuery10);
					
					if (value1 > 0) {
						System.out.println("This is saved");
					} else {
						System.out.println("This is not saved");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
