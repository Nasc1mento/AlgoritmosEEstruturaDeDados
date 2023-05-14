package test.unit.first.question2;

public class Car {

	private int distance;
	private StateCar state;
	private int shieldCount;
	
	public Car() {
		this.distance = 0;
		this.state = StateCar.NORMAL;
		this.shieldCount = 0;
	}
	
	public String getCarEmoji() {
		
		if (state == StateCar.EXPLODED)
			return "💥";
		
		return "🏎";
	}
	
	public StateCar state() {
		return this.state;
	}
	
	public void explode() {
		this.state = StateCar.EXPLODED;
	}
	
	public int distance() {
		return this.distance;
	}
	
	public void run() {
		distance++;
	}
	
	public void protect() {
		shieldCount++;
	}
	
	public int shields() {
		return this.shieldCount;
	}
	
	
}
