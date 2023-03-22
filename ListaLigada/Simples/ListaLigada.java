package ListaLigada.Simples;

public class ListaLigada<T> {
	private No<T> head;
	private No<T> tail;
	
	public ListaLigada() {
		head = null;
		tail = null;
	}

	public void addFirst(T item) {
		
		if (isVoid())
			head = tail = new No<T>(item);
		else
			head = new No<>(item, head);
	}

	public void addLast(T item) {
		
		if (isVoid())
			head = tail = new No<T>(item);
		else {
			tail.setNext(new No<T>(item));
			tail = tail.getNext();
		}
	}

	public T removeFirst() {
		
		if (isVoid()) {
			return null;
		}
		T item = head.getContent();

		if (head == tail)
			head = tail = null;
		else
			head = head.getNext();
		return item;
	}

	public T removeLast() {
		
		if (isVoid()) {
			return null;
		}
		
		T item = tail.getContent();
		
		if (head == tail)
			head = tail = null;
		else {
			No<T> atual = head;
			
			while (atual.getNext() != tail)
				atual = atual.getNext();
			
			tail = atual;
			atual.setNext(null);
		}
		return item;
	}

	public String list() {
		
		String temp = "<";
		if (isVoid()) {
			temp += "Void ";
			return temp;
		}
		No<T> current = head;
		while (current != null) {
			temp += current.getContent() + ", ";
			current = current.getNext();
		}
		temp += ">";
		return temp;
	}
	
	// Localize/ Pesquise/Encontre (search) elementos
	public boolean exist(T content) {
		
		if (isVoid()) {
			return false;
		}
		
		No<T> temp = head;
		while (temp != null) {
			if (temp.getContent().equals(content)) 
				return true;			
			temp = temp.getNext();
		}
		return false;
	}
	
	// Localize/ Pesquise/Encontre (search) elementos
	public T getContentByIndex(int n){
		if (isVoid()) {
			return null;
		}
				
		int count = 0;
		No<T> temp = head;
		
		while (count != n) {		
			temp = temp.getNext();
			count++;
		}
		return temp.getContent();
	}
	
	public int indexOf(T content) {
		if (isVoid()) {
			return -1;
		}
				
		int count = 0;
		No<T> temp = head;
		
		while (temp != null) {
			if (temp.getContent().equals(content))
				return count;
			temp = temp.getNext();
			count++;
		}
		return -1;
	}
	
	public int length() {
		
		int count = 0;
		
		No <T> temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}		
		return count;
	}
	
	// Concatenar/intercalar (Merge) duas listas
	public ListaLigada<T> concat(ListaLigada<T> otherList) {
		
		tail.setNext(otherList.head);
		return this;
	}
	
	// Copiar lista
	public ListaLigada<T> copy() {
		
		No<T> temp = head;
		ListaLigada<T> otherList = new ListaLigada<T>();
		while (temp != null) {
			otherList.addLast(temp.getContent());
			temp = temp.getNext();
		}
		return otherList;
	}
	
	public ListaLigada<ListaLigada<T>> divideList (int n) {
		
		ListaLigada<ListaLigada<T>> lists = new ListaLigada<ListaLigada<T>>();
		int length = this.length();
		int part = length / n;
		int remaining = length % n;
		No<T> temp = head;
		
		for (int i = 0; i < n; i++ ) {
			int currentLength = part + (i < remaining ? 1 : 0);
			ListaLigada<T> list = new ListaLigada<T>();
			for (int j = 0; j < currentLength; j++) {
				list.addLast(temp.getContent());
				temp = temp.getNext();
			}
			lists.addLast(list);
		}
		return lists;
	}
	
	public boolean isVoid() {
		return head == null;
	}
}
