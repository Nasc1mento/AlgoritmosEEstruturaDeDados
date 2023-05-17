package test.unit.first.question3;

public class QueueClients {

	private Client first;
	private Client end;
	private int size;

	public QueueClients() {
		first = end = null;
		this.size = 0;
	}

	public void enqueue(Client client) {

		if (isEmpty()) {
			first = end = client;
			size++;
			return;
		}

		if (client.isPriority()) {
			client.setNext(first);
			first = client;
			size++;
		} else {
			end.setNext(client);
			end = client;
			size++;
		}
	}

	public Client dequeue() {

		if (isEmpty())
			return null;

		Client temp = first;

		if (first == end) {
			first = end = null;
			size--;
			return temp;
		}

		first = first.getNext();
		size--;
		return temp;

	}

	public Client peek() {
		return this.first;
	}

	public int size() {
		return this.size;
	}
	
	public boolean contains(Client client) {
		if (isEmpty())
			return false;
		
		Client temp = first;
		
		while (temp != null) {
			if (temp.equals(client))
				return true;
			temp = temp.getNext();
		}
		
		return false;
	}

	public String toString() {
		String temp = "[";
		if (isEmpty()) {
			temp += "]";
			return temp;
		}
		Client aux = first;
		while (aux != null) {
			temp += aux + ", ";
			aux = aux.getNext();
		}
		temp += "]";
		return temp;
	}

	public boolean isEmpty() {
		return this.first == null;
	}
}
