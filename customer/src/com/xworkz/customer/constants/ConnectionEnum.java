package com.xworkz.customer.constants;

public enum ConnectionEnum {

	URL("jdbc:mysql://127.0.0.1:3306/customer"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
