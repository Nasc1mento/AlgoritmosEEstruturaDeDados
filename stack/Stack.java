package stack;

import queue.Node;
/**
 * 
 * @author Adryan Nascimento Reis
 * Pilha feita com uma lista ligada
 * @param <T>
 */
public class Stack<T> {

	private Node<T> head;
	private Node<T> tail;

	public Stack() {
		head = tail = null;
	}
	/**
	 * Adiciona no topo da pilha
	 * @param data
	 */
	public void push(T data) {
		if (head == null)
			head = tail = new Node<T>(data);
		else {
			head = new Node<T>(head, data);
		}
	}
	/**
	 * Remove do topo da pilha
	 * @return
	 */
	public T pop() {
		if (head == null)
			return null;

		T data = tail.getData();
		if (head == tail)
			head = null;
		else {
			head = head.getNext();
		}
		return data;
	}
	
	/**
	 * Retorna o elemento no topo da pilha
	 * @return
	 */
	public T peek() {
		return this.head.getData();
	}
	
	/**
	 * Reseta a pilha
	 */
	public void reset() {
		head = tail = null;
	}
	
	/**
	 * Imprime o estado da pilha
	 * @return
	 */
	public String state() {

		String temp = "";
		if (head == null) {
			temp += "";
			return temp;
		}
		Node<T> current = head;
		while (current != null) {
			temp += current.getData() + " ";
			current = current.getNext();
		}
		temp+="\n";
		return temp.trim();
	}
}
