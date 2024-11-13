package com.xworkz.wheels.constants;

public enum ConnectionEnum1 {

	URL("jdbc:mysql://127.0.0.1:3306/jet"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionEnum1(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}

