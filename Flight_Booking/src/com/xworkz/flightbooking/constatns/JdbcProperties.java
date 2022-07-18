package com.xwrokz.flightbooking.constatns;

public enum JdbcProperties {

	URL("jdbc:mysql://localhost:3306/xworkz_btm_march"), USERNAME("root"), SECRET("root");

	private String value;

	private JdbcProperties(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;

	}

}
