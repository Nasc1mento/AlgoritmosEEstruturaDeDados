package stack;
/**
 * 
 * @author Adryan Nascimento Reis
 * Nó da pilha
 * @param <T>
 */
public class Node <T>{
	
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
	
	public Node(Node<T> next, T data) {
		this.next = next;
		this.data = data;
	}
	
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public T getData() {
		return this.data;
	}
	
}