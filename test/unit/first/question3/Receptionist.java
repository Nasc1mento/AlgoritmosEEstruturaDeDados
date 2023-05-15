package test.unit.first.question3;

public class Receptionist extends Funcionary {

	public Receptionist(String name) {
		super(name, Departament.RECEPTION);
	}
	
	public Departament redirect() {
		return Departament.getRandomDepartament();
	}
	
	
}
