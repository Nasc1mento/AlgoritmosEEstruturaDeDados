package test.unit.first.question2;

public enum StateCar {

	NORMAL(1), PROTECTED(2), EXPLODED(3);

	private int value;

	private StateCar(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
