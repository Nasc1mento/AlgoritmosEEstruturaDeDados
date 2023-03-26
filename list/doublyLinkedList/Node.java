package list.doublyLinkedList;
/**Implementação de Nó de Lista Duplamente Ligada para a disciplina de Algorítmos e 
 * Estrutura de Dados
 * 
 * @author Adryan Nascimento Reis
 *
 * @param <T>
 */
public class Node <T> {
	
	private Node<T> previous;
	private Node<T> next;
	private T data;
	
	
	/**
	 * Construtor feito para a criação de nós à lista vazia
	 * @param data
	 */
	public Node(T data){
		this.previous = null;
		this.next = null;
		this.data = data;
	}
	/**
	 * Construtor feito para criação de nós no início e fim da lista
	 * @param previous
	 * @param next
	 * @param data
	 */
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
