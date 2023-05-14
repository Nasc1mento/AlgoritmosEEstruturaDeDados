package test.unit.first.question2;

public class Car {

	private int position;
	private StateCar state;
	
	public Car() {
		this.position = 0;
		this.state = StateCar.NORMAL;
	}
	
	public String getCarEmoji() {
		if (state == StateCar.NORMAL)
			return "🏎";
		else if (state == StateCar.PROTECTED)
			return "🛡️";
		else
			return "💥";
	}
	
	
	public int getPosition() {
		return this.position;
	}
	
	
}
