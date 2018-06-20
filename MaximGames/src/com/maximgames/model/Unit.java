package com.maximgames.model;

import com.maximgames.enums.UnitType;

public class Unit {

	private UnitType unitType;

	public Unit() {
		super();
	}

	public Unit(UnitType unitType) {
		super();
		this.unitType = unitType;
	}



	@Override
	public String toString() {
		return unitType.getValue();
	}
		
}
