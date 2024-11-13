package com.xworkz.wheels.runner;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.wheels.constants.ConnectionEnum1;

public class JetRunner {

	public static void main(String[] args) {
		

			Connection connection= null;
			PreparedStatement prst=null;

			try {
				connection=DriverManager.getConnection(ConnectionEnum1.URL.getValue(), ConnectionEnum1.USERNAME.getValue(),
						ConnectionEnum1.PASSWORD.getValue());

				prst = connection.prepareStatement("INSERT INTO bike_table (ID, Make, Model) values (?, ?, ?)");
				prst.setInt(1, 1);
				prst.setString(2, "Boeing ");
				prst.setString(3, "747");

				prst.setInt(1, 2);
				prst.setString(2, "Airbus");
				prst.setString(3, "A380");

				prst.setInt(1, 3);
				prst.setString(2, "Gulfstream");
				prst.setString(3, "G650");

				prst.setInt(1, 4);
				prst.setString(2, "Dassault");
				prst.setString(3, "Falcon");

				prst.setInt(1, 5);
				prst.setString(2, "Cessna");
				prst.setString(3, "Citation");

				prst.setInt(1, 6);
				prst.setString(2, "Embraer");
				prst.setString(3, "Legacy");

				prst.setInt(1, 7);
				prst.setString(2, "Lockheed");
				prst.setString(3, "F-35 Lightning II");

				prst.setInt(1, 8);
				prst.setString(2, "Northrop");
				prst.setString(3, "B-2 Spirit");

				prst.setInt(1, 9);
				prst.setString(2, "Sukhoi");
				prst.setString(3, "Su-57");

				prst.setInt(1, 10);
				prst.setString(2, "McDonnell");
				prst.setString(3, "F-15 Eagle");

				prst.setInt(1, 11);
				prst.setString(2, "General Dynamics");
				prst.setString(3, "F-16 Fighting Falcon");

				prst.setInt(1, 12);
				prst.setString(2, "Bombardier");
				prst.setString(3, "Global");

				prst.setInt(1, 13);
				prst.setString(2, "Eurofighter");
				prst.setString(3, "Typhoon");

				prst.setInt(1, 14);
				prst.setString(2, "Saab");
				prst.setString(3, "jas ");
			

				prst.setInt(1, 15);
				prst.setString(2, "Mitsubishi");
				prst.setString(3, "MRJ90");
				
				
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
