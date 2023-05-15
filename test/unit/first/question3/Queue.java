package test.unit.first.question3;

import list.simplyLinkedList.Node;

public class Queue {
	
	private Client first;
	private Client end;
	private Departament departament;
	private int size;
	
	
	public Queue(Departament departament) {
		first = end = null;
		this.departament = departament;
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
		}else {
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
	
	public String toString() {
		String temp = this.departament+":[";
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
	
	public Departament getDepartament() {
		return this.departament;
	}
	
}
