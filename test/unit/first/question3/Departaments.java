package test.unit.first.question3;

import java.util.Random;

public enum Departaments {
	
	CAR_SALE(1),
	MECHANICAL_WORKSHOP(2),
	ACCESSORIES(3);
	
	private int value;
	
	private Departaments(int value) {
		this.value = value;
	}
	
	public static Departaments getRandomDepartament() {
		Departaments[] departament = Departaments.values();
		int index = new Random().nextInt(departament.length);
		return departament[index];
	}
}
