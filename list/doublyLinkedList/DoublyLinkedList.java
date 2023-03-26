package list.doublyLinkedList;
/**Implementação de umaLista duplamente ligada feita para a disciplina de 
 * Algorítmos e Estrutura de Dados
 * 
 * @author Adryan Nascimento Reis
 *
 * @param <T>
 */
public class DoublyLinkedList <T>{
	
	private Node<T> head;
	private Node<T> tail;
	
	public DoublyLinkedList() {
		head = tail = null;
	}
	
	/**
	 * Cria um nó no início da lista, se a lista possui mais de um nó, o nó criado
	 * terá como próximo o atual primeiro.
	 * @param data
	 */
	public void addFirst(T data) {
		if(isEmpty())
			head = tail = new Node<T>(data);
		else 
			head = new Node<T>(null, head, data);		
	}
	
	/**
	 * Cria um nó no fima da lista, se a lista possui mais de um nó, esse nó a ser 
	 * criado terá como predecessor o atual ultimo, e depois o mesmo será a cauda
	 * @param data
	 */
	public void addLast(T data) {
		if(isEmpty())
			head = tail = new Node<T>(data);
		else {
			tail.setNext(new Node<T>(tail,null,data));
			tail = tail.getnext();
		}
	}
	
	/**
	 * Remove o primeiro nó da lista, se a lista possui mais de um elemento, o prime
	 * @return
	 */
	public T removeFirst() {
		
		if (isEmpty())
			return null;
		
		T data = head.getData();
		
		if(head == tail)
			head = tail = null;
		else
			head = head.getnext();
		return data;
	}
	
	/**
	 * Remove o último nó da lista, se a lista possui mais de um nó, a cauda será igual
	 * ao nó antes dele, e o que era a cauda o Garbage Collector vai remover da
	 * memória (Eu acho, verificar a veracidade disso depois)
	 * @return
	 */
	public T removeLast() {
		
		if (isEmpty()) {
			return null;
		}
		
		T data = tail.getData();
		
		if (head == tail)
			head = tail = null;
		else 
			tail = tail.getPrevious();
		return data;
	}
	
	/**
	 * Insere o nó na posicção especificada
	 * @param position
	 * @param data
	 */
	public void insertAt(int position, T data) {
		
		if (isEmpty()) {
			head = tail = new Node<T>(data);
			return;
		}
		
		Node<T> aux = getNodeByIndex(position);
			
		if(aux == head)
			addFirst(data);
		else if(aux == tail)
			addLast(data);
		else {
			Node<T> node = new Node<T>(aux.getPrevious(), aux, data);
			aux.getnext().setPrevious(node);
			aux.getPrevious().setNext(node);
		}
	}
	/**
	 * Remove o nó na posição especificada
	 * @param position
	 * @return
	 */
	public T removeAt(int position) {
		
		if (isEmpty()) {
			return null;
		}
		
		Node<T> aux = getNodeByIndex(position);
		
		if(aux == head)
			removeFirst();
		else if(aux == tail)
			removeLast();
		else {
			aux.getPrevious().setNext(aux.getnext());
			aux.getnext().setPrevious(aux.getPrevious());
		}
		return aux.getData();
	}
	
	/**
	 * Itera sobre a lista até a posição especificada e retorna o nó
	 * @param position
	 * @return
	 */
	public Node<T> getNodeByIndex (int position) {
		
		Node<T> aux = head;
		int count = 0;
		
		while(aux != null) {
			if(count == position) {
				return aux;
			}
			count++;
			aux = aux.getnext();
		}
		return null;
	}
	
	/**
	 * Itera a lista e imprime o valores dentro de um <>, se estiver vazia imprime Empty
	 * @return
	 */
	public String list() {
		String temp = "<";
		if (isEmpty()) {
			temp += "Empty ";
			return temp;
		}
		Node<T> current = head;
		while (current != null) {
			temp += current.getData() + ", ";
			current = current.getnext();
		}
		temp += ">";
		return temp;
	}
	
	/**
	 * Concatena duas listas interligando a cauda com a cabeça da outra
	 * @param list
	 * @return
	 */
	public DoublyLinkedList<T> concat(DoublyLinkedList<T> list){
		if(isEmpty())
			head = tail = list.head;
		else {
			tail.setNext(list.head);
			list.head.setPrevious(tail);
		}
		return this;
	}
	/**
	 * Verfica se a lista está vazia
	 * @return
	 */
	public boolean isEmpty() {
		return this.head == null;
	}
}
