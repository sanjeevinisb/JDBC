package com.xworkz.cart.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cart.constants.ConnectionEnum;

public class SelectQuery1 {

	public static void main(String[] args) {


		String query="select * from cart_table";
		try {
			Connection connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(query);
			if(!resultSet.next())
			{
				System.out.println("database is not found");
			}
			else
			{

				do{


					 int id = resultSet.getInt("id");
                     String name = resultSet.getString("name");
                     String email = resultSet.getString("email");
                     String address = resultSet.getString("address");
                     String phoneNumber = resultSet.getString("phoneNumber");
                     String password = resultSet.getString("password");
                     int cartId = resultSet.getInt("cartId");
                     int itemCount = resultSet.getInt("itemCount");
                     double totalPrice = resultSet.getDouble("totalPrice");
                     String status = resultSet.getString("status");
                    

                     System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", address: " + address +  ",phoneNumber: " + phoneNumber + ", cartId: " + cartId + ", address: " + address + ", password: " + password + ", itemCount: " + itemCount + ", totalPrice: " + totalPrice+ ", status: " + status);
	               System.out.println();
				}while(resultSet.next());
			}


		}




		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
