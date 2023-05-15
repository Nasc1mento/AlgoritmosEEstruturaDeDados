package test.unit.first.question3;

import java.util.Random;

public enum Departament {
	
	RECEPTION(0),
	CAR_SALE(1),
	MECHANICAL_WORKSHOP(2),
	ACCESSORIES(3);
	
	private int value;
	
	private Departament(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static Departament getRandomDepartament() {
		Departament[] departament = Departament.values();
		int index = new Random().nextInt(departament.length-1)+1;
		return departament[index];
	}
}
