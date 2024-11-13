package com.xworkz.wheels.constants;

public enum ConnectionEnum3 {

	URL("jdbc:mysql://127.0.0.1:3306/wheels"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionEnum3(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}