package test.unit.first.question3;

public class Token {
	
	private Client client;
	private Departaments departament;
	
	public Token(Client client) {
		this.client = client;
		this.departament = Departaments.getRandomDepartament();
	}
	
	public Client getClient() {
		return this.client;
	}
	
	public Departaments getDepartament() {
		return this.getDepartament();
	}
}
