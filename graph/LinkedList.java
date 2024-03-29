package graph;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T>tail;
	
	public LinkedList() {
		this.head = tail = null;
	}
	
	public Node<T> getHead() {
		return this.head;
	}
	
	public Node<T> getTail() {
		return this.tail;
	}
	
	public void addLast(T value) {
		if (isEmpty()) {
			this.head = tail = new Node<>(value);
			return;
		}
		
		this.tail.setNext(new Node<T>(value, tail, null));
		this.tail = tail.getNext();
	}
	
	public void addFirst(T value) {
		if (isEmpty()) {
			this.head = tail = new Node<>(value);
			return;
		}
		
		this.head.setPrevious(new Node<T>(value, null, head));
		this.head = head.getPrevious();	
	}
	
	public T removeFirst() {
		T t = head.getValue();
		
		if (isEmpty()) {
			this.head = tail = null;
			return t;
		}
		
		this.head.getNext().setPrevious(head.getPrevious());
		this.head = head.getNext();
		return t;
	}
	
	public T removeLast() {
		T t = head.getValue();
		
		if (isEmpty()) {
			this.head = tail = null;
			return t;
		}
		
		this.tail.getPrevious().setNext(tail.getNext());
		this.tail = tail.getPrevious();
		
		return t;		
	}
	
	public T remove(T value) {
		Node<T> temp = this.head;
		
		while (temp != null) {		
			if (temp.getValue().equals(value)) {
				return temp.getValue();
			}
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public Node<T> get(T value) {
		Node<T> temp = this.head;
		
		while (temp != null) {
			if (temp.getValue() == value)
				return temp;
			temp = temp.getNext();
		}
		
		return null;
	}
	
	public void print() {
	    Node<T> temp = head;

	    while (temp != null) {
	        System.out.print(temp.getValue() + " ");
	        temp = temp.getNext();
	    }

	    System.out.println();
	}
	
	
	public void clear() {
		this.head = tail = null;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
}
