package graph;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(next, previous, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Node<?> other = (Node<?>) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + ", previous=" + previous + "]";
	}
	
}
