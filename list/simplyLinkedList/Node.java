package list.simplyLinkedList;
/**Implantação de Nó para a disciplina de Algorítmos e estrutura de Dados
 * 
 * @author Adryan Nascimento Reis
 *
 * @param <T>
 */
public class Node <T>{
	
	private T content;
	private Node<T> next;
	
	/**
	 * Construtor utilizado para adicionar o novo nó no fim da lista
	 * @param content
	 */
	public Node(T content) {
		this.content = content;
		this.next = null;
	}
	
	/**
	 * Construtor utilizado para adicionar o novo nó no início da lista
	 * @param content
	 * @param next
	 */
	public Node(T content, Node<T> next) {
		this.content = content;
		this.next = next;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> no) {
		this.next = no;
	}

	public T getContent() {
		return this.content;
	}
	
	public void setContent(T data) {
		this.content = data;
	}

}
