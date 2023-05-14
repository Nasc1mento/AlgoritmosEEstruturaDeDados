package test.unit.first.question2;

public class Main {
	
	public static void main(String[] args) {
		Track track = new Track(50);
		Car car = new Car();
		System.out.println(car.getCarEmoji());
		System.out.println(track.state());
	}
	
}
