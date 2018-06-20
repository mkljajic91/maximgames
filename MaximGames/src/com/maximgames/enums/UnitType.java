package com.maximgames.enums;

public enum UnitType {
	
	YES("Y"), NO("N");
	
	private String value;

	private UnitType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
