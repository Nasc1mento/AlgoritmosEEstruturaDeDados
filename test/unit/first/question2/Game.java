package test.unit.first.question2;

import java.util.Scanner;

public class Game {
	
	private Track track;
	private Car car;
	
	
	
	public Game() {
		this.track = new Track(10);
		this.car = new Car();
	}
	
	public void loop()  {
		
		
		Brick currentBrick = track.getFirstBrick();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(car.getCarEmoji());
		System.out.println(track.state());
		
		while (car.state() != StateCar.EXPLODED && currentBrick != null) {		
			String play = scanner.next();   
		
			if (play.equals("d")) {
				car.run();
				currentBrick = currentBrick.getNext();
				track.destroyBrick();
				System.out.println("cheguei aqui");
			}
			
			if (play.equals("w")) {
				car.jump();
				currentBrick = currentBrick.getNext().getNext();
				track.destroyBrick();
				track.destroyBrick();
			}
			  
			if (currentBrick != null) {
				 if (currentBrick.getType() == TypeBrick.ENERGY)
				    car.protect();
				 if (currentBrick.getType() == TypeBrick.BOMB)
				   car.explode();
			}
			
		    System.out.println(car.getCarEmoji());
		    System.out.println(track.state());
		    
		}		
	}
}
