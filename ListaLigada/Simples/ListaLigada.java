package ListaLigada.Simples;
/**
* Implementação de Lista Ligada para a disciplina de Algorítmos e Estrutura de Dados
* @author Adryan Nascimento Reis
* 
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
	 * @param item
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
	 * @param item
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
	 * @return T
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
	 * @return T
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
	 * @return String
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
	 * 
	 * @param content
	 * @return boolean
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

	// Localize/ Pesquise/Encontre (search) elementos
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
			if (temp == node)
				return count;
			temp = temp.getNext();
			count++;
		}
		return -1;
	}

	// Localize/ Pesquise/Encontre (search) elementos
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

	public int length() {

		int count = 0;

		No<T> temp = head;
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

	// Escreva uma rotina em Java para trocar os elementos m e n de uma lista
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

	// Escreva uma rotina em Java para trocar os índices m e n de uma lista
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
	
	public void inssub(ListaLigada<T> l1, int i1, ListaLigada<T> l2, int i2, int len) {
		
	}
	
	
	/**
	 * Verifica se a lista está vazia
	 * @return boolean
	 */
	public boolean isEmpty() {
		return head == null;
	}
}
