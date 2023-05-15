package test.unit.first.question3;

public class Attendant extends Funcionary{

	public Attendant(String name, Departament departament) {
		super(name, departament);
	}
	
	public Client serve(Queue queue) {
		return queue.dequeue();
	}
}
