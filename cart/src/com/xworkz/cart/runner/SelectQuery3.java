package com.xworkz.cart.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cart.constants.ConnectionEnum;

public class SelectQuery3 {

	public static void main(String[] args) {


		String query="(select address from cart_table where name='Nikhita' and phoneNumber=7795342166)";
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

					 String address = resultSet.getString("address");
                     System.out.println("Address: " + address);
				}while(resultSet.next());
			}


		}




		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}