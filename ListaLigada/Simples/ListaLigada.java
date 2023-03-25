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
	 * Dado um número n, iterar sobre a lista a partir do índice o zero, e quanto chegar em
	 * n retornar o conteúdo do nó n.
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
	 * Retorna o índice do primeiro nó que possui T como conteúdo
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
	 * Retorna o índice do nó que aponta para o mesmo lugar que paramêtro.
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
	 * Retorna o nó no índice especificado
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
	 * Retorna o tamanho da lista
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
	 * Concatena a lista com a lista passada como paramêtro, colocando o último nó da
	 * primeira lista apontar para o primeiro da segunda
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
	 * Adiciona os mesmos elemento da lista this à uma lista cópia
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
	 * Divide a lista em n pedaços. Faz a divisão inteira do tamanho da lista com n,
	 * depois o resto da divisão (remaining), no laço, se i for menor que remaining,
	 * adiciono um elemento a mais na parte, senão, adiciono nada. Isso garante com que
	 * a lista possua tamanho iguais ou semelhantes(pedaços com +1) 
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
	 * Cria duas varáveis que apontam para mesmo lugar que os nós dos índices m e n, e faz
	 * a troca dos elementos desses nós.
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
	 * Cria quatro nós que apontam para os indíces m e n, e seus antecessores. Faz o nó
	 * antecessor de m apontar n e o nó anteccesor de n apontar para m, mas se m for o
	 * primeiro índice, n será o primeiro índice, e vice-versa. Após isso, faz o nó m
	 * apontar para onde n estava apontando, n para onde m estava apontando.
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
	 * A mesma coisa que o swapIndexes, só que swapIndexes(0, menorNumero) e 
	 * só para números
	 */
	public void minorFirst() {
		if(head == tail || isEmpty()) {
			return;
		}
		
		No<T> aux = head;
		No<T> antecessorMinor = null;
		No<T> minor = head;
		
		while(aux.getNext() != null) {
			No<T> temp = aux;
			aux = aux.getNext();
			
			if ((Integer)minor.getContent() > (Integer)aux.getContent()) {
				antecessorMinor = temp;
				minor = aux;
			}
		}
				
//		int alvo = indexOf(minor);
//		swapIndexes(0,alvo);
		No<T> first = head;
		head = minor;
		antecessorMinor.setNext(first);
		No<T> second = first.getNext();
		first.setNext(minor.getNext());
		minor.setNext(second);	
	}
	
	public void reverse() {
		
	}
	
	/**
	 * Verifica se a lista está vazia olhando para o primeiro nó da lista
	 * @return boolean
	 */
	public boolean isEmpty() {
		return head == null;
	}
}
