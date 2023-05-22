package tree.binary;

public class Node <T> {
	
	private T value;
	private Node<T> left;
	private Node<T> right;
	
	public Node(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public Node<T> getLeft() {
		return this.left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return this.right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public T getValue() {
		return this.value;
	}
	
	
}
