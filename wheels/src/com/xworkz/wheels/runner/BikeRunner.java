package com.xworkz.wheels.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.wheels.constants.ConnectionEnum2;

public class BikeRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(ConnectionEnum2.URL.getValue(),
					ConnectionEnum2.USERNAME.getValue(), ConnectionEnum2.PASSWORD.getValue());

			prst = connection.prepareStatement("INSERT INTO bike_table (ID, Make, Model) values (?, ?, ?)");
			prst.setInt(1, 1);
			prst.setString(2, "Yamaha ");
			prst.setString(3, "YZF-R1");

			prst.setInt(1, 2);
			prst.setString(2, "Honda");
			prst.setString(3, "CBR600RR");

			prst.setInt(1, 3);
			prst.setString(2, "Ducati");
			prst.setString(3, "Panigale V2");

			prst.setInt(1, 4);
			prst.setString(2, "Kawasaki");
			prst.setString(3, "Ninja ZX-10R");

			prst.setInt(1, 5);
			prst.setString(2, "Suzuki");
			prst.setString(3, "GSX-R750");

			prst.setInt(1, 6);
			prst.setString(2, "BMW");
			prst.setString(3, "S1000RR");

			prst.setInt(1, 7);
			prst.setString(2, "Aprilia");
			prst.setString(3, "RSV4");

			prst.setInt(1, 8);
			prst.setString(2, "Triumph");
			prst.setString(3, "Daytona");

			prst.setInt(1, 9);
			prst.setString(2, "KTM");
			prst.setString(3, "RC390");

			prst.setInt(1, 10);
			prst.setString(2, "Harley");
			prst.setString(3, "Iron 883");

			prst.setInt(1, 11);
			prst.setString(2, "Royal Enfield");
			prst.setString(3, "Interceptor 650");

			prst.setInt(1, 12);
			prst.setString(2, "Bajaj");
			prst.setString(3, "Pulsar RS200");

			prst.setInt(1, 13);
			prst.setString(2, "Hero");
			prst.setString(3, "Xtreme 200R");

			prst.setInt(1, 14);
			prst.setString(2, "TVS");
			prst.setString(3, "Apache ");

			prst.setInt(1, 15);
			prst.setString(2, "Husqvarna");
			prst.setString(3, "Svartpilen");

			
			
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
