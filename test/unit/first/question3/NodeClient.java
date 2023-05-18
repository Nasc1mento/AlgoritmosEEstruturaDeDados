package test.unit.first.question3;

public class QueueClients {

	private NodeClient first;
	private NodeClient end;
	private int size;

	public QueueClients() {
		first = end = null;
		this.size = 0;
	}

	public void enqueue(Client client) {

		if (isEmpty()) {
			first = end = new NodeClient(client);
			size++;
			return;
		}

		if (client.isPriority()) {
//			first = new NodeClient(first, client);
//			size++;
			
			NodeClient current = first;
			NodeClient previous = null;
			
			while (current != null && current.getClient().isPriority()) {
				previous = current;
				current = current.getNext();
			}
			
			
			NodeClient newClient = new NodeClient(current, client);
			if (previous == null) {
				first = newClient;
			}else {
				previous.setNext(newClient);
			}
			
		} else {
			end.setNext(new NodeClient(client));
			size++;
		}
	}

	public Client dequeue() {

		if (isEmpty())
			return null;

		NodeClient temp = first;

		if (first == end) {
			first = end = null;
			size--;
			return temp.getClient();
		}

		first = first.getNext();
		size--;
		return temp.getClient();

	}

	public Client peek() {
		return this.first.getClient();
	}

	public int size() {
		return this.size;
	}
	
	public boolean contains(Client client) {
		if (isEmpty())
			return false;
		
		NodeClient temp = first;
		
		while (temp != null) {
			if (temp.getClient().equals(client))
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
		Client aux = first.getClient();
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
