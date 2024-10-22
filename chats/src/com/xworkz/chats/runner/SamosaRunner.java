package com.xworkz.chats.runner;

public class SamosaRunner {

	public static void main(String[] args) {

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("..........");
	} 
	catch (ClassNotFoundException e) 
	{
		e.printStackTrace();
	}

	}

}
