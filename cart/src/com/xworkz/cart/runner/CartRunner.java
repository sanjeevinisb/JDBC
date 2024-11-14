package com.xworkz.cart.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.cart.constants.ConnectionEnum;
import com.xworkz.cart.dto.CartDTO;

public class CartRunner {

    public static void main(String[] args) {

        CartDTO cartDto1 = new CartDTO(1, "Sanjeevini", "sanjeevini@gmail.com", "Dharawad", "7795786533", "sanjeevini@1", 11, 4, 9500, "Pending");
        CartDTO cartDto2 = new CartDTO(2, "Sneha", "sneha@gmail.com", "Bagalkot", "9908765435", "sneha@2", 12, 2, 3000, "Compeleted");
        CartDTO cartDto3 = new CartDTO(3, "Nikhita", "nikhita@gmail.com", "Hubli", "7795342166", "nikhita@3", 13, 5, 2500, "Processing");
        CartDTO cartDto4 = new CartDTO(4, "Poorna", "poorna@gmail.com", "Koppala", "8088563251", "poorna@4", 14, 6, 6000, "Pending");
        CartDTO cartDto5 = new CartDTO(5, "Bharati", "bharati@gmail.com", "Haveri", "7676895432", "bharati@5", 15, 7,5500, "Processing");
        CartDTO cartDto6 = new CartDTO(6, "Aarati", "aarati@gmail.com", "Gadag", "9907654321", "aarati@6", 16, 8, 8500, "Compeleted");
        CartDTO cartDto7 = new CartDTO(7, "Padma", "padma@gmail.com", "Bijapur", "8088674592", "padma@7", 17, 9, 7800, "Compeleted");
        CartDTO cartDto8 = new CartDTO(8, "Tanaya", "tanaya@gmail.com", "Gulbarga", "9902767431", "tanaya@8", 18, 1, 56000, "Processing");
        CartDTO cartDto9 = new CartDTO(9, "Ashwini", "ashwini@gmail.com", "Raichur", "9483996514", "ashwini@9", 19, 3, 7700, "Pending");
        CartDTO cartDto10 = new CartDTO(10, "Krishav", "krishav@gmail.com", "Belagavi", "9908123456", "krishav@10", 20, 10, 4300, "Processing");

			CartDTO[] dtos= {cartDto1,cartDto2,cartDto3,cartDto4,cartDto5,cartDto6,cartDto7,cartDto8,cartDto9,cartDto10};
			Connection connection=null;
			PreparedStatement prst=null;
			try {

				connection=DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
				prst=connection.prepareStatement("insert into cart_table values(?,?,?,?,?,?,?,?,?,?)");
				for(CartDTO dto:dtos)
				{
					prst.setInt(1,dto.getId() );
					prst.setString(2, dto.getName());
					prst.setString(3, dto.getEmail());
					prst.setString(4, dto.getAddress());
					prst.setString(5,dto.getPhoneNumber());
					prst.setString(6, dto.getPassword());
					prst.setInt(7, dto.getCartId());
					prst.setInt(8, dto.getItemCount());
					prst.setDouble(9, dto.getTotalPrice());
					prst.setString(10, dto.getStatus());
					prst.addBatch();
				}
				int[] ref=prst.executeBatch();
				for(int value:ref)
				{
					if(value>0)
					{
						System.out.println("Saved");
					}
					else
					{
						System.out.println("Not saved");
					}
				}

			}

			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
