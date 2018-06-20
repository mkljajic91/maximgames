package com.maximgames.enums;

public enum FieldType {
	LAND("L"), SEA("S"), COAST("C"), TOWN("T");

	private String value;

	private FieldType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}