package com.xworkz.wheels.constants;

public enum ConnectionEnum2 {

	URL("jdbc:mysql://127.0.0.1:3306/bike"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionEnum2(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
