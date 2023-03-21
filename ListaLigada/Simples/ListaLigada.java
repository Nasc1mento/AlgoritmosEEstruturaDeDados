package ListaLigada.Simples;

public class ListaLigada<T> {
	private No<T> primeiro;
	private No<T> ultimo;
	
	public ListaLigada() {
		primeiro = null;
		ultimo = null;
	}

	public void insereNaFrente(T item) {
		if (vazia())
			primeiro = ultimo = new No<>(item);
		else
			primeiro = new No<>(item, primeiro);
	}

	public void insereNoFundo(T item) {
		if (vazia())
			primeiro = ultimo = new No<>(item);
		else {
			ultimo.setProximo(new No<>(item));
			ultimo = ultimo.getProximo();
		}
	}

	public T removeDaFrente() {
		if (vazia()) {
			return null;
		}
		T item = primeiro.getConteudo();

		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else
			primeiro = primeiro.getProximo();
		return item;
	}

	public T removeDoFundo() {
		if (vazia()) {
			return null;
		}
		
		T item = ultimo.getConteudo();
		
		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else {
			No<T> atual = primeiro;
			
			while (atual.getProximo() != ultimo)
				atual = atual.getProximo();
			
			ultimo = atual;
			atual.setProximo(null);
		}
		return item;
	}

	public String listar() {
		String temp = "<";
		if (vazia()) {
			temp += "Vazia ";
			return temp;
		}
		No<T> atual = primeiro;
		while (atual != null) {
			temp += atual.getConteudo() + ", ";
			atual = atual.getProximo();
		}
		temp += ">";
		return temp;
	}
	// Localize/ Pesquise/Encontre (search) elementos
	public boolean localizar(T conteudo) {
		if (vazia()) {
			return false;
		}
		
		No<T> aux = primeiro;
		while (aux != null) {
			if (aux.getConteudo().equals(conteudo)) 
				return true;			
			aux = aux.getProximo();
		}
		return false;
	}
	
	// Localize/ Pesquise/Encontre (search) elementos
	public No<T> getNoByIndice(int n){
		if (vazia()) {
			return null;
		}
				
		int contador = 0;
		No<T> aux = primeiro;
		
		while (contador != n) {		
			aux = aux.getProximo();
			contador++;
		}
		return aux;
	}
	
	public int getTamanho() {
		int contador = 0;
		
		No <T> temp = primeiro;
		while (temp != null) {
			contador++;
			temp = temp.getProximo();
		}		
		return contador;
	}
	// Concatenar/intercalar (Merge) duas listas
	public ListaLigada<T> concatenar(ListaLigada<T> outra) {
		ultimo.setProximo(outra.primeiro);
		return this;
	}
	
	// Copiar lista
	public ListaLigada<T> copiar() {
		No<T> temp = primeiro;
		ListaLigada<T> outra = new ListaLigada<T>();
		while (temp != null) {
			outra.insereNoFundo(temp.getConteudo());
			temp = temp.getProximo();
		}
		return outra;
	}
	
//	public ListaLigada<T> [] divdirListaEmN (int n) {
//		ListaLigada<T> [] lista = new ListaLigada[n];
//		return lista;
//	}
	
	public boolean vazia() {
		return primeiro == null;
	}
}
