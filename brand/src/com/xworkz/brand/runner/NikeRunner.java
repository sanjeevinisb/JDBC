package com.xworkz.brand.runner;

public class NikeRunner {

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
