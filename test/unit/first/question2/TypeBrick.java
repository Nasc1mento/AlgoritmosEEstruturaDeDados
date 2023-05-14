package test.unit.first.question2;

import java.util.Random;

public enum TypeBrick {

	NORMAL(1), ENERGY(2), BOMB(3);

	private int value;

	private TypeBrick(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public static TypeBrick getValueFromBrick(int value) {
		for (TypeBrick type : values()) {
			if (type.getValue() == value)
				return type;
		}
		return null;
	}

	public static TypeBrick getRandomBrick() {
		TypeBrick[] bricks = TypeBrick.values();
		int index = new Random().nextInt(bricks.length);
		return bricks[index];
	}

}
