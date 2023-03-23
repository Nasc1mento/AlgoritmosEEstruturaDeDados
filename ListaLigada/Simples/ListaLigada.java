package ListaLigada.Simples;
/** Implementação de Lista Ligada para a disciplina de Algorítmos e Estrutura de Dados
 * 
 * @author Adryan Nascimento Reis
 *
 * @param <T>
 */
public class ListaLigada<T> {
	private No<T> head;
	private No<T> tail;
	
	
	public ListaLigada() {
		head = tail = null;
	}
	/**
	 * Adiciona item no início da lista. Se a lista estiver vazia, adicionando um elemento,
	 * o primeiro tanto o último elemento sao iguais, senão, o nó a ser criado terá como
	 * próximo nó o atual primeiro.
	 * @param
	 */
	public void addFirst(T item) {

		if (isEmpty())
			head = tail = new No<T>(item);
		else
			head = new No<T>(item, head);
	}
	/**
	 * Adiciona item no final da lista. Se a lista estiver vazia, adicionando um elemento,
	 * o primeiro tanto o último elemento sao iguais, senão, o ultimo nó atual terá como 
	 * próximo elemento o novo elemento, e esse novo elemento terá um próximo null
	 * @param
	 */
	public void addLast(T item) {

		if (isEmpty())
			head = tail = new No<T>(item);
		else {
			tail.setNext(new No<T>(item));
			tail = tail.getNext();
		}
	}
	/**
	 * Se a lista está vazia, retorna null. Se só tem um elemento, tanto o primeiro quanto
	 * o último será nullo, senão o primeiro a lista será o próximo do atual primeiro, e 
	 * retorna o contúdo do nó remvido
	 * @return
	 */
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
	/**
	 * Se a lista está vazia, retorna null. Se há um só elemento, tanto o primeiro quanto
	 * o ultimo nó serão null, senão é feito o seguinte: aponta para o primeiro nó da lista
	 * e itera sobre a lista até o nó antes do último, o ultimo será igual ele e próximo será
	 * null.
	 * @return
	 */
	public T removeLast() {

		if (isEmpty()) {
			return null;
		}

		T item = tail.getContent();

		if (head == tail)
			head = tail = null;
		else {
			No<T> temp = head;

			while (temp.getNext() != tail)
				temp = temp.getNext();

			tail = temp;
			temp.setNext(null);
		}
		return item;
	}
	/**
	 * Lista os elementos dentro da lista. Se houver um objeto tipo uma outra Lista, essa
	 * não irá ser listada, mostrando somente o endereço de memória
	 * @return
	 */
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

	/**
	 * Verifica se um determinado dado está entre os nós. Se a lista está vazia retorna
	 * false. Casa contrário, a lista é iterada até encontrar o nó com o dado passado, se
	 * existe retorna true, senão, false.
	 * @param content
	 * @return
	 */
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

	/**
	 * 
	 * @param n
	 * @return
	 */
	public T getContentByIndex(int n) {
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

	/**
	 * 
	 * @param content
	 * @return
	 */
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
	/**
	 * 
	 * @param node
	 * @return
	 */
	public int indexOf(No<T> node) {
		if (isEmpty()) {
			return -1;
		}

		int count = 0;
		No<T> temp = head;

		while (temp != null) {
			if (temp == node)
				return count;
			temp = temp.getNext();
			count++;
		}
		return -1;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public No<T> getNodeByIndex(int n) {
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
	
	/**
	 * 
	 * @return
	 */
	public int length() {

		int count = 0;

		No<T> temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	/**
	 * 
	 * @param otherList
	 * @return
	 */
	public ListaLigada<T> concat(ListaLigada<T> otherList) {

		if (isEmpty())
			head = tail = otherList.head;
		else
			tail.setNext(otherList.head);

		return this;
	}

	/**
	 * 
	 * @return
	 */
	public ListaLigada<T> copy() {

		No<T> temp = head;
		ListaLigada<T> otherList = new ListaLigada<T>();
		while (temp != null) {
			otherList.addLast(temp.getContent());
			temp = temp.getNext();
		}
		return otherList;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public ListaLigada<ListaLigada<T>> divideList(int n) {

		ListaLigada<ListaLigada<T>> lists = new ListaLigada<ListaLigada<T>>();
		int length = length();
		int part = length / n;
		int remaining = length % n;
		No<T> temp = head;

		for (int i = 0; i < n; i++) {
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

	/**
	 * 
	 * @param m
	 * @param n
	 */
	public void swapElements(int m, int n) {

		if (isEmpty() || length() < 2)
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

	/**
	 * 
	 * @param m
	 * @param n
	 */
	public void swapIndexes(int m, int n) {
		No<T> antecessorNodeIndexM = getNodeByIndex(m - 1);
		No<T> antecessorNodeIndexN = getNodeByIndex(n - 1);
		No<T> nodeIndexM = getNodeByIndex(m);
		No<T> nodeIndexN = getNodeByIndex(n);

		if (nodeIndexM != null && nodeIndexN != null) {
			if (antecessorNodeIndexM != null)
				antecessorNodeIndexM.setNext(nodeIndexN);
			else
				head = nodeIndexN;
			if (antecessorNodeIndexN != null)
				antecessorNodeIndexN.setNext(nodeIndexM);
			else
				head = nodeIndexM;
			
			No<T> temp = nodeIndexM.getNext();
			nodeIndexM.setNext(nodeIndexN.getNext());
			nodeIndexN.setNext(temp);
		}
	}
	
	/**
	 * 
	 * @param l1
	 * @param i1
	 * @param l2
	 * @param i2
	 * @param len
	 */
	public void inssub(ListaLigada<T> l1, int i1, ListaLigada<T> l2, int i2, int len) {
		
	}
	
	
	/**
	 * Verifica se a lista está vazia olhando para o primeiro nó da lista
	 * @return boolean
	 */
	public boolean isEmpty() {
		return head == null;
	}
}
