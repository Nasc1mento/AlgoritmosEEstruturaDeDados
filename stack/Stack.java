package stack;

import queue.Node;

public class Stack<T> {

	private Node<T> head;
	private Node<T> tail;

	public Stack() {
		head = tail = null;
	}

	public void push(T data) {
		if (head == null)
			head = tail = new Node<T>(data);
		else {
			head = new Node<T>(head, data);
		}
	}

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

	public T peek() {
		return this.tail.getData();
	}

	public void reset() {
		head = tail = null;
	}

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
