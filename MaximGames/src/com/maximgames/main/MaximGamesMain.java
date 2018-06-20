package com.maximgames.main;

import java.awt.print.Printable;
import java.util.Random;

import com.maximgames.enums.FieldType;
import com.maximgames.enums.UnitType;
import com.maximgames.model.Field;
import com.maximgames.model.Unit;

public class MaximGamesMain {
	
	private static FieldType[] filedTypes = FieldType.values();
	private static Random random = new Random();

	private static int width = 60;
	private static int height = 80;
	
	public static void main(String[] args) {
					
		Field[][] maps = new Field [height][width];
		
		Unit unitYes = new Unit(UnitType.YES);
		Unit unitNo = new Unit(UnitType.NO);
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				FieldType fieldType = random();
				maps [i][j] = new Field(fieldType, unitYes);
			}	
		}
		
		printMatrix(maps);
		
	}
	
	private static FieldType random() {
		return filedTypes[random.nextInt(filedTypes.length)];
	}
	
	
	private static void printMatrix(Field[][] maps) {
		
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print(maps[i][j]);
			}	
			System.out.println();
		}
		
	}
}
