package ListaLigada.Simples;

public class ListaLigada<T> {
	private No<T> head;
	private No<T> tail;
	
	public ListaLigada() {
		head = tail = null;
	}

	public void addFirst(T item) {
		
		if (isEmpty())
			head = tail = new No<T>(item);
		else
			head = new No<T>(item, head);
	}

	public void addLast(T item) {
		
		if (isEmpty())
			head = tail = new No<T>(item);
		else {
			tail.setNext(new No<T>(item));
			tail = tail.getNext();
		}
	}

	public T removeFirst() {
		
		if (isEmpty()) {
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
		
		if (isEmpty()) {
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
		if (isEmpty()) {
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
	public boolean contains(T content) {
		
		if (isEmpty()) {
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
		if (isEmpty()) {
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
	// Localize/ Pesquise/Encontre (search) elementos
	public int indexOf(T content) {
		if (isEmpty()) {
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
	public int indexOf(No<T> node) {
		if (isEmpty()) {
			return -1;
		}
				
		int count = 0;
		No<T> temp = head;
		
		while (temp != null) {
			if (temp==node)
				return count;
			temp = temp.getNext();
			count++;
		}
		return -1;
	}
	// Localize/ Pesquise/Encontre (search) elementos
	public No<T> getNodeByIndex(int n){
		if (isEmpty() || n > length() || n < 0) {
			return null;
		}
				
		int count = 0;
		No<T> temp = head;
		
		while (count != n) {		
			temp = temp.getNext();
			count++;
		}
		return temp;
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
		
		if (isEmpty()) 
			head = tail = otherList.head;
		else
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
	// Dividir uma lista em várias (k)
	public ListaLigada<ListaLigada<T>> divideList (int n) {
		
		ListaLigada<ListaLigada<T>> lists = new ListaLigada<ListaLigada<T>>();
		int length = length();
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
	// Escreva uma rotina em Java para trocar os elementos m e n de uma lista
	public void swapElements(int m, int n) {
		
		if(isEmpty() || length() < 2)
			return;
		
		if (m == n)
            return;
  
        No<T> nodeIndexM = getNodeByIndex(m);
        No<T> nodeIndexN = getNodeByIndex(n);
        
        if (nodeIndexM != null && nodeIndexN != null) {
            T temp = nodeIndexM.getContent();
            nodeIndexM.setContent(nodeIndexN.getContent());
            nodeIndexN.setContent(temp);
        }		
	}
	
	// Escreva uma rotina em Java para trocar os índices m e n de uma lista
	public void swapIndexes(int m, int n) {
//		if(isEmpty() || length() < 2)
//			return;
//		
//		if (m == n)
//            return;
//  
//        No<T> nodeIndexM = getNodeByIndex(m);
//        No<T> nodeIndexN = getNodeByIndex(n);
//        
//        if (nodeIndexM != null && nodeIndexN != null) {
//            No<T> temp = nodeIndexM;
//            nodeIndexM = nodeIndexN;
//            nodeIndexN = temp;
//        }
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
