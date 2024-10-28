package com.xworkz.car.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarRunner {
	
	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/car";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into car_table values (1,'Audi','5500000'),"
				+ "(2,'BMW','16700000'),"
				+ "(3,'Chery','270000000')"
				+ "(4,'Dodge','369000000')"
				+"(5,'Ferrari','450000000')"
				+"(6,'Geely','570000000')"
				+"(7,'Honda','680000000')"
				+ "(8,'Isuzu','790000000')"
				+ "(9,'Jaguar','890000000')"
				+ "(10,'KIA','11900000')"
				+"(11,'Mahindra','7900000')"
				+ "(12,'Nissan','1700000')"
				+ "(13,'ZAZ','88700000')"
				+ "(14,'TATA Motors','54000000')"
				+ "(15,'Volkwagen','98000000')"
				+ "(16,'Mercedes Benz','19000000')"
				+ "(17,'Volvo','66000000')"
				+ "(18,'Suzuki','96000000')"
				+ "(19,'Ford','86000000')"
				+  "(20,'MG','83000000')";
		
		String updateQuery = "update car_table set car_brand = 'Bentley' WHERE id = 1";
		String updateQuery1 = "update car_table set car_brand = 'Toyota' WHERE id = 2";
		String updateQuery2 = "update car_table set car_brand = 'Lexus' WHERE id = 3";
		String updateQuery3 = "update car_table set car_brand = 'Porsche' WHERE id = 4";
		String updateQuery4 = "update car_table set car_brand = 'Bugatti' WHERE id = 5";
		String updateQuery5 = "update car_table set car_brand = 'Rolls Royce' WHERE id = 6";
		String updateQuery6 = "update car_table set car_brand = 'Tesla' WHERE id = 7";
		String updateQuery7 = "update car_table set car_brand = 'Chevrolet' WHERE id = 8";
		String updateQuery8 = "update car_table set car_brand = 'Fiat' WHERE id = 9";
		String updateQuery9 = "update car_table set car_brand = 'Jeep' WHERE id = 10";
		String deleteQuery1="delete from car_table where id=11";
        String deleteQuery2="delete from car_table where id=12";
        String deleteQuery3="delete from car_table where id=13";
        String deleteQuery4="delete from car_table where id=14";
        String deleteQuery5="delete from car_table where id=15";
        String deleteQuery6="delete from car_table where id=16";
        String deleteQuery7="delete from car_table where id=17";
        String deleteQuery8="delete from car_table where id=18";
        String deleteQuery9="delete from car_table where id=19";
        String deleteQuery10="delete from car_table where id=20";


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
