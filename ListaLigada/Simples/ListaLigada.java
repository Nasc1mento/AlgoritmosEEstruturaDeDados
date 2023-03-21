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

	public String toString() {
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
	public ListaLigada<T> concatenar(ListaLigada<T> outra){
		ultimo.setProximo(outra.primeiro);
		return this;
	}
	
	
	
	public boolean vazia() {
		return primeiro == null;
	}
}
