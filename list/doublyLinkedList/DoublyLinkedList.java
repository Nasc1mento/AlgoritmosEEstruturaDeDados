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
	
	public void insertAt(int position, T data) {
		
		if (isEmpty())
			return;
		
		int count = 0;
		MyNode<T> aux = head;
		
		while(aux != null) {
			if(count == position) {
				break;
			}
			count++;
			aux = aux.getnext();
		}
		
		if(aux == head)
			addFirst(data);
		else if(aux == tail)
			addLast(data);
		else {
			MyNode<T> node = new MyNode<T>(aux, aux.getnext(), data);
			aux.getnext().setPrevious(node);
			aux.getPrevious().setNext(node);
		}
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
