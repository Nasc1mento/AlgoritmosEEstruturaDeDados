package list.doublyLinkedList;

public class Node <T> {
	
	private Node<T> previous;
	private Node<T> next;
	private T data;
	
	
	
	public Node(T data){
		this.previous = null;
		this.next = null;
		this.data = data;
	}
	
	public Node(Node<T> previous, Node<T> next, T data) {
		this.previous = previous;
		this.next = next;
		this.data = data;
	}
	
	public void setNext(Node<T> next){
		this.next = next;
	}
	
	public Node<T> getnext(){
		return this.next;
	}
	
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
	public Node<T> getPrevious() {
		return this.previous;
	}
	
	
	public T getData() {
		return this.data;
	}
	
	
}
