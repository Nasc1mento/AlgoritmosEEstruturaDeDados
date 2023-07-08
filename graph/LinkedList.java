package graph;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T>tail;
	
	public LinkedList() {
		this.head = this.tail = null;
	}
	
	public void addLast(T value) {
		if (isEmpty())
			this.head = tail = new Node<>(value);
		
		this.tail.setNext(new Node<T>(value, tail, null));
		this.tail = tail.getNext();
	}
	
	public void addFirst(T value) {
		if (isEmpty())
			this.head = tail = new Node<>(value);
		
		Node<T> newNode = new Node<T>(value, null, head);
		this.head.setPrevious(newNode);
		this.head = newNode;
		
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
	
	public boolean isEmpty() {
		return this.head == null;
	}
}
