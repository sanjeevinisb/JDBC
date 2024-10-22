package com.xworkz.box.runner;

public class MiltonRunner {

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


