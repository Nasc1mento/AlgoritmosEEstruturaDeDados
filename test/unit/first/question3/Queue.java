package test.unit.first.question3;

public class Queue {
	
	Client first;
	Client end;
	Departaments departament;
	
	
	public Queue(Departaments departament) {
		first = end = null;
		this.departament = departament;
	}
	
	public void enqueue() {
		
	}
	
	public Client dequeue() {
		return null;
	}
	
	public Client peek() {
		return this.first;
	}
	
	public int size() {
		return 0;
	}
	
	public String state() {
		return null;
	}
	
}
