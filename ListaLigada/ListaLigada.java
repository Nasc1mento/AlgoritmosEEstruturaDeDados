package ListaLigada;

public class ListaLigada<T> {
	private No<T> primeiro;
	private No<T> ultimo;
	
	public ListaLigada() {
		primeiro = null;
		ultimo = null;
	}

	public void InsereNaFrente(T item) {
		if (Vazia())
			primeiro = ultimo = new No<>(item);
		else
			primeiro = new No<>(item, primeiro);
	}

	public void InsereNoFundo(T item) {
		if (Vazia())
			primeiro = ultimo = new No<>(item);
		else {
			ultimo.setProximo(new No<>(item));
			ultimo = ultimo.getProximo();
		}
	}

	public T RemoveDaFrente() {
		if (Vazia()) {
			return null;
		}
		T item = primeiro.getDado();

		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else
			primeiro = primeiro.getProximo();
		return item;
	}

	public T RemoveDoFundo() {
		if (Vazia()) {
			return null;
		}
		T item = ultimo.getDado();
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
		if (Vazia()) {
			temp += "Vazia ";
			return temp;
		}
		No<T> atual = primeiro;
		while (atual != null) {
			temp += atual.getDado() + ", ";
			atual = atual.getProximo();
		}
		temp += ">";
		return temp;
	}
	
	public T localizar(String conteudo) {
		if (Vazia()) {
			return null;
		}
		No<T> aux = primeiro;
		while (aux != null) {
			if (aux.getDado() == conteudo) 
				return aux.getDado();			
			aux = aux.getProximo();
		}
		return null;
		
		
	}
	public boolean Vazia() {
		return primeiro == null;
	}
}
