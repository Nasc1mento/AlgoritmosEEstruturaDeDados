package test.unit.first.question3;

public class Receptionist extends Funcionary {

	public Receptionist(String name) {
		super(name);
	}
	
	public Departaments redirect() {
		return Departaments.getRandomDepartament();
	}
	
	
}
