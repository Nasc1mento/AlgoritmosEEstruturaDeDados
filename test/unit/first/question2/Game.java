package test.unit.first.question2;

import java.util.Scanner;

public class Game {
	
	public static final int SIZE_TRACK = 10;
	private Track track;
	private Car car;
	
	
	
	public Game() {
		this.track = new Track(SIZE_TRACK);
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
		
		if (car.state() == StateCar.EXPLODED) {
			System.out.println("Game over");
			System.out.println("Energy: "+car.shields()+", Bombs: "+car.bombs()+ ", Distance: "+car.distance());
			System.out.println("New Game? (y)yes or (*)no");
			Scanner scLoose = new Scanner(System.in);
			String choice = scLoose.next();
			if (choice.equals("y")) {
				car = new Car();
				track = new Track(SIZE_TRACK);
				loop();
			}else
				System.exit(0);
		}else {
			System.out.println("You win !!!");
			System.out.println("Energy: "+car.shields()+", Bombs: "+car.bombs()+ ", Distance: "+car.distance());
			System.out.println("Expand? (y)yes or (*)no");
			Scanner scWinner = new Scanner(System.in);
			String choice = scWinner.next();
			if (choice.equals("y")) {
				track.expand(SIZE_TRACK);
				loop();				
			}else
				System.exit(0);
						
		}
		
		
		
	}
}
