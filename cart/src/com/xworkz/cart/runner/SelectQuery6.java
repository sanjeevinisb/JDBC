package com.xworkz.cart.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cart.constants.ConnectionEnum;

public class SelectQuery6 {

	public static void main(String[] args) {

		String query="(select email,password from cart_table where phoneNumber='9908765435' and name='Sneha')";
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

					String email = resultSet.getString("email");
                    String password = resultSet.getString("password");
                    System.out.println("email: " + email + ", Password: " + password);
				}while(resultSet.next());
			}


		}




		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}


}
