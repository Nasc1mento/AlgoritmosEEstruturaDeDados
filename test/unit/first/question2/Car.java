package test.unit.first.question2;

public class Car {

	private int distance;
	private StateCar state;
	private int energyCount;
	private int bombCount;
	
	public Car() {
		this.distance = 0;
		this.state = StateCar.NORMAL;
		this.energyCount = 0;
		this.bombCount = 0;
	}
	
	public String getCarEmoji() {
		
		if (state == StateCar.EXPLODED)
			return "💥";
		if (state == StateCar.PROTECTED)
			return "🛡️";
		return "🏎";
	}
	
	public StateCar state() {
		return this.state;
	}
	
	public void explode() {
		bombCount++;
		if (bombCount > energyCount) {
			this.state = StateCar.EXPLODED;
			return;
		}
		
		if (bombCount < energyCount) {
			this.state = StateCar.PROTECTED;
			return;
		}
		
		this.state = StateCar.NORMAL;
	}
	
	public int distance() {
		return this.distance;
	}
	
	public void run() {
		distance++;
	}
	
	public void protect() {
		this.state = StateCar.PROTECTED;
		energyCount++;
	}
	
	public int energy() {
		return this.energyCount;
	}
	
	public void jump() {
		distance+=2;
	}
	
	public int bombs() {
		return this.bombCount;
	}
	
	
}
