package test.unit.first.question3;

public class Receptionist extends Funcionary {

	public Receptionist(String name) {
		super(name);
	}
	
	public Token getToken(Client client) {
		return new Token(client);
	}
	
	
}
