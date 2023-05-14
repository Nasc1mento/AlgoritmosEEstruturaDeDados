package test.unit.first.question2;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Track track = new Track(10);
		Car car = new Car();
		Brick currentBrick = track.getFirstBrick();
		String emojiCar = car.getCarEmoji();
		
		while (currentBrick.getType() != TypeBrick.BOMB) {
			System.out.println(emojiCar);
		    System.out.println(track.state());
		    car.run();
		    currentBrick = currentBrick.getNext();
		    track.destroyBrick();
		    Thread.sleep(1000);
		}
		
		car.explode();
		System.out.println(emojiCar.substring(0, emojiCar.length())+car.getCarEmoji());
	    System.out.println(track.state());
		
	}
	
}
