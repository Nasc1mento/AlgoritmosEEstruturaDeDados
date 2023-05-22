package tree.binary;

public class Tree<T extends Comparable<T>> {

	private Node<T> root;

	public Tree() {

	}
	
	public boolean search(T value) {
		return search(this.root, value);
	}

	public Node<T> insert(T value) {
		return insert(this.root, value);
	}

	public void print() {
		print(this.root);
	}
	
	public void reset() {
		this.root = null;
	}

	private boolean search(Node<T> node, T value) {
		
		if (node == null)
			return false;
		else if (value.compareTo(node.getValue()) == 0)
			return true;
		else if (value.compareTo(node.getValue()) < 0)
			return search(node.getLeft(), value);
		else
			return search(node.getRight(), value);
	}

	private Node<T> insert(Node<T> node, T value) {
		
		if (root == null) {
			this.root = new Node<T>(value);
			return root;
		}
		
		if (node == null)
			return new Node<T>(value);
		
		if (this.root.getValue() == value)
			throw new DuplicateValueException();

		if (value.compareTo(node.getValue()) < 0)
			node.setLeft(insert(node.getLeft(), value));

		if (value.compareTo(node.getValue()) > 0)
			node.setRight(insert(node.getRight(), value));
		
		return node;
	}

	private void print(Node<T> node) {
		if (node != null) {
			System.out.println(node.getValue());
			print(node.getLeft());
			print(node.getRight());
		}	
	}

}
