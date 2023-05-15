package test.unit.first.question3;

public class Token {
	
	private Client client;
	private Funcionary funcionary;
	private int tableNumber;
	
	
	public Token(Client client, Funcionary funcionary) {
		this.client = client;
		this.funcionary = funcionary;
		this.tableNumber = funcionary.getDepartament().getValue();
	}
	
	public String toString() {
		return "[Client: "+client.getName()+", Funcionary: "+funcionary.getName()+", Table: "+tableNumber+"]";
	}
}
