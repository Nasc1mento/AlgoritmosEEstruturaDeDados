package test.unit.first.question3;

public class NodeClient {

	private NodeClient next;
	private Client client;

	public NodeClient(NodeClient next, Client client) {
		this.next = next;
		this.client = client;
	}

	public NodeClient(Client client) {
		this.next = null;
		this.client = client;
	}

	public NodeClient getNext() {
		return next;
	}

	public void setNext(NodeClient next) {
		this.next = next;
	}

	public Client getClient() {
		return client;
	}

}
