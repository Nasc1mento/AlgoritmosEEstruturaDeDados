package test.unit.first.question2;

public class Track {

	private Brick first;
	private Brick last;
	private int length;

	public Track(int size) {
		this.length = size;
		for (int i = 1; i <= size; i++) {
			addBrick(TypeBrick.getRandomBrick());
		}
	}

	private void addBrick(TypeBrick typeBrick) {

		if (first == null)
			first = last = new Brick(typeBrick);
		else {
			last.setNext(new Brick(typeBrick));
			last = last.getNext();
		}
	}
	
	public void destroyBrick() {
		first = first.getNext();
	}

	public void expand(int size) {
		for (int i = 1; i <= size; i++) {
			addBrick(TypeBrick.getRandomBrick());
		}
	}

	public int getlength() {
		return this.length;
	}
	
	public String state() {
		String temp = "";
		Brick current = first;
		while (current != null) {
			temp+="🧱";
			current = current.getNext();
		}
		temp += "🏁";
		return temp;
	}
	
	
	public Brick getFirstBrick() {
		return this.first;
	}
	
	public Brick getLastBrick() {
		return this.last;
	}
	
	
}
