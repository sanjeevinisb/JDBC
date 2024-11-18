package com.xworkz.subscription.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.subscription.constants.ConnectionEnum;
import com.xworkz.subscription.dto.SubscriptionDTO;

public class SubscriptionRepoImpl implements SubscriptionRepository {
	@Override
	public boolean save(SubscriptionDTO subscriptionDTO) {
		boolean valid = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
				ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
				PreparedStatement prst = connection.prepareStatement("INSERT INTO subscription_table (id,name, email,phoneNumber, address, subscriptionType) VALUES (?,?, ?, ?, ?, ?)")) {
			prst.setInt(1, subscriptionDTO.getId());
			prst.setString(2, subscriptionDTO.getName());
			prst.setString(3, subscriptionDTO.getEmail());
			prst.setString(4, subscriptionDTO.getPhoneNumber());
			prst.setString(5, subscriptionDTO.getAddress());
			prst.setString(6, subscriptionDTO.getSubscriptionType());

			int value = prst.executeUpdate();
			if (value > 0) {
				System.out.println("Data is saved");
				valid = true;
			} else {
				valid = false;
				System.err.println("Data is not saved");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}
}
