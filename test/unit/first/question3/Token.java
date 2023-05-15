package test.unit.first.question3;

public class Token {
	
	private Client client;
	private Funcionary funcionary;
	
	
	public Token(Client client, Funcionary funcionary) {
		this.client = client;
		this.funcionary = funcionary;
	}
	
	public String toString() {
		return "Client: "+client+", Funcionary: "+funcionary;
	}
}
