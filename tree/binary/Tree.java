package tree.binary;

public class Tree<T extends Comparable<T>>{
	
	private Node<T> root;
	
	public Tree(T value) {
		this.root = new Node<T>(value);
	}
}
