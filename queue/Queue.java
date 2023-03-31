package queue;



public class Queue<T> {

	private Node<T> head;
	private Node<T> tail;

	public Queue() {
		head = tail = null;
	}

	public void enqueue(T data) {
		if (head == null)
			head = tail = new Node<T>(data);
		else {
			
			tail.setNext(new Node<T>(data));
			tail = tail.getNext();
		}
	}
	
	public T dequeue() {
		if(head == null)
			return null;
		
		T temp = head.getData();
		
		if(head == tail)
			head = tail = null;
		else {
			head = head.getNext();
		}
		
		return temp;	
	}
	
	public T peek() {
		return this.head.getData();
	}
	
	
	public String toString() {

		String temp = "<";
		if (head == null) {
			temp += "Void ";
			return temp;
		}
		Node<T> current = head;
		while (current != null) {
			temp += current.getData() + ", ";
			current = current.getNext();
		}
		temp += ">";
		return temp;
	}

}
