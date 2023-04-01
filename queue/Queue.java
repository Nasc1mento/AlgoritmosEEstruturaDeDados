package queue;


/**
 * 
 * @author Adryan Nascimento Reis
 * Fila feita com uma lista ligada
 * @param <T>
 */
public class Queue<T> {

	private Node<T> head;
	private Node<T> tail;

	public Queue() {
		head = tail = null;
	}
	
	/**
	 * Adiciona no final da fila
	 * @param data
	 */
	public void enqueue(T data) {
		if (head == null)
			head = tail = new Node<T>(data);
		else {
			
			tail.setNext(new Node<T>(data));
			tail = tail.getNext();
		}
	}
	
	/**
	 * Remove o primeiro da fila
	 * @return
	 */
	public T dequeue() {
		if(head == null)
			return null;
		
		T temp = head.getData();
		
		if(head == tail)
			head = tail = null;
		else {
			head = head.getNext();
		}
		
		return temp;	
	}
	
	/**
	 * Retorna o primeiro elemento da fila
	 * @return
	 */
	public T peek() {
		return this.head.getData();
	}
	
	/**
	 * (toString mas poderia ser outra coisa) Imprime o estado da fila
	 */
	public String toString() {

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
