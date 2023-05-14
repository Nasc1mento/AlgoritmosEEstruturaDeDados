package test.unit.first.question2;

public class Brick {

	private Brick next;
	private TypeBrick type;
		
	public Brick(TypeBrick type, Brick next) {
		this.type = type;
		this.next = next;
	}
	
	public Brick(TypeBrick type) {
		this.type = type;
	}
	
	
	public Brick getNext() {
		return this.next;
	}
	
	public void setNext(Brick next) {
		this.next = next;
	}
		
	public TypeBrick getType() {
		return this.type;
	}
}
