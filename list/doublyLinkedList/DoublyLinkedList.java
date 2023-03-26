package list.doublyLinkedList;



public class DoublyLinkedList <T>{
	
	private MyNode<T> head;
	private MyNode<T> tail;
	
	public DoublyLinkedList() {
		head = tail = null;
	}
	
	
	public void addFirst(T data) {
		if(isEmpty())
			head = tail = new MyNode<T>(data);
		else 
			head = new MyNode<T>(null, head, data);		
	}
	
	public void addLast(T data) {
		if(isEmpty())
			head = tail = new MyNode<T>(data);
		else {
			tail.setNext(new MyNode<T>(tail,null,data));
			tail = tail.getnext();
		}
	}
	
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
	
	public T removeLast() {
		
		if (isEmpty()) {
			return null;
		}
		
		T data = tail.getData();
		
		if (head == tail)
			head = tail = null;
		else
			tail.getPrevious().setNext(tail.getnext());
		return data;
	}
	
	public void insertAt(int position, T data) {
		

		if (isEmpty()) {
			head = tail = new MyNode<T>(data);
			return;
		}
		
		MyNode<T> aux = getNodeByIndex(position);
			
		if(aux == head)
			addFirst(data);
		else if(aux == tail)
			addLast(data);
		else {
			MyNode<T> node = new MyNode<T>(aux.getPrevious(), aux, data);
			aux.getnext().setPrevious(node);
			aux.getPrevious().setNext(node);
		}
	}
	
	public T removeAt(int position) {
		
		if (isEmpty()) {
			return null;
		}
		
		MyNode<T> aux = getNodeByIndex(position);
		
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
	
	
	public MyNode<T> getNodeByIndex (int position) {
		
		MyNode<T> aux = head;
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
	
	public String list() {
		String temp = "<";
		if (isEmpty()) {
			temp += "Void ";
			return temp;
		}
		MyNode<T> current = head;
		while (current != null) {
			temp += current.getData() + ", ";
			current = current.getnext();
		}
		temp += ">";
		return temp;
	}

	
	
	public boolean isEmpty() {
		return this.head == null;
	}
}
