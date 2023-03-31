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
			tail.setNext(new Node<T>(data));
			tail = tail.getNext();
		}
	}

	public T pop() {
		if (head == null)
			return null;

		T data = tail.getData();
		if (head == tail)
			head = null;
		else {
			Node<T> temp = head;
			while (temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			tail.setNext(null);
		}
		return data;
	}

	public T peek() {
		return this.tail.getData();
	}

	public String state() {

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
