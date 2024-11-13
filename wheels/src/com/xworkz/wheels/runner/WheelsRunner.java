package com.xworkz.wheels.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.wheels.constants.ConnectionEnum3;

public class WheelsRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(ConnectionEnum3.URL.getValue(),
					ConnectionEnum3.USERNAME.getValue(), ConnectionEnum3.PASSWORD.getValue());

			prst = connection.prepareStatement("INSERT INTO wheels_table (ID, Make, Model) values (?, ?, ?)");
			prst.setInt(1, 1);
			prst.setString(2, "Honda");
			prst.setString(3, "Civic");

			prst.setInt(1, 2);
			prst.setString(2, "Ford");
			prst.setString(3, "Mustang");

			prst.setInt(1, 3);
			prst.setString(2, "Chevrolet");
			prst.setString(3, "Impala");

			prst.setInt(1, 4);
			prst.setString(2, "Nissan");
			prst.setString(3, "Altima");

			prst.setInt(1, 5);
			prst.setString(2, "BMW");
			prst.setString(3, "X5");

			prst.setInt(1, 6);
			prst.setString(2, "Audi");
			prst.setString(3, "A4");

			prst.setInt(1, 7);
			prst.setString(2, "Mercedes-Benz");
			prst.setString(3, "C-Class");

			prst.setInt(1, 8);
			prst.setString(2, "Volkswagen");
			prst.setString(3, "Golf");

			prst.setInt(1, 9);
			prst.setString(2, "Hyundai");
			prst.setString(3, "Elantra");

			prst.setInt(1, 10);
			prst.setString(2, "Kia");
			prst.setString(3, "Soul");

			prst.setInt(1, 11);
			prst.setString(2, "Tesla");
			prst.setString(3, "Model 3");

			prst.setInt(1, 12);
			prst.setString(2, "Mazda");
			prst.setString(3, "CX-5");

			prst.setInt(1, 13);
			prst.setString(2, "Subaru");
			prst.setString(3, "Outback");

			prst.setInt(1, 14);
			prst.setString(2, "Toyota");
			prst.setString(3, "Corolla");

			prst.setInt(1, 15);
			prst.setString(2, "Jaguar");
			prst.setString(3, "XF");

			int value = prst.executeUpdate();

			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.err.println("Not Saved");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
