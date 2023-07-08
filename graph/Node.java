package graph;

public class Node <T> {
		
	private T value;
	private Node<T> next;
	private Node<T> previous; 
		
	public Node(T value) {
		this.value = value;
		this.next = null;
		this.previous = null;
	}
	
	public Node(T value, Node<T> previous, Node<T> next) {
		this.value = value;
		this.previous = previous;
		this.next = next;
	}
		
	public void setPrevious (Node<T> previous) {
		this.previous = previous;
	}
	
	public Node<T> getPrevious() {
		return this.previous;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public T getValue() {
		return this.value;
	}

}
