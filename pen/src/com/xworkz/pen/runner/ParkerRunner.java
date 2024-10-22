package com.xworkz.pen.runner;

public class ParkerRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("created static block");
		} 
		catch (ClassNotFoundException e) 
		{
		e.printStackTrace();
		}
			}
	}


