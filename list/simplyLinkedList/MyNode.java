package list.simplyLinkedList;
/**Implantação de Nó para a disciplina de Algorítmos e estrutura de Dados
 * 
 * @author Adryan Nascimento Reis
 *
 * @param <T>
 */
public class MyNode <T>{
	
	private T content;
	private MyNode<T> next;
	
	/**
	 * Construtor utilizado para adicionar o novo nó no fim da lista
	 * @param content
	 */
	public MyNode(T content) {
		this.content = content;
		this.next = null;
	}
	
	/**
	 * Construtor utilizado para adicionar o novo nó no início da lista
	 * @param content
	 * @param next
	 */
	public MyNode(T content, MyNode<T> next) {
		this.content = content;
		this.next = next;
	}

	public MyNode<T> getNext() {
		return this.next;
	}

	public void setNext(MyNode<T> no) {
		this.next = no;
	}

	public T getContent() {
		return this.content;
	}
	
	public void setContent(T data) {
		this.content = data;
	}

}
