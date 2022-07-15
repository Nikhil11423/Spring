package com.xworkz.flightbooking.constant;

public enum JdbcProperties {

	URL("jdbc:mysql://localhost:3306/xworkz-jdbc"), USERNAME("root"), SECRET("Xworkzodc@123");

	private String value;

	private JdbcProperties(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;

	}
}
