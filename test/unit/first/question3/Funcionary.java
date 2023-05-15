package test.unit.first.question3;

public abstract class Funcionary {
	
	private String name;
	private Departament departament;
	
	public Funcionary(String name, Departament departament) {
		this.name = name;
		this.departament = departament;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Departament getDepartament() {
		return this.departament;
	}
}
