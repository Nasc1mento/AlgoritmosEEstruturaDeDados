package ListaLigada;

public class ListaLigada {
	private No primeiro;
	private No ultimo;
	
	public ListaLigada() {
		primeiro = null;
		ultimo = null;
	}

	public void InsereNaFrente(String item) {
		if (Vazia())
			primeiro = ultimo = new No(item);
		else
			primeiro = new No(item, primeiro);
	}

	public void InsereNoFundo(String item) {
		if (Vazia())
			primeiro = ultimo = new No(item);
		else {
			ultimo.setProximo(new No(item));
			ultimo = ultimo.getProximo();
		}
	}

	public String RemoveDaFrente() {
		if (Vazia()) {
			return null;
		}
		String item = primeiro.getDado();

		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else
			primeiro = primeiro.getProximo();
		return item;
	}

	public String RemoveDoFundo() {
		if (Vazia()) {
			return null;
		}
		String item = ultimo.getDado();
		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else {
			No atual = primeiro;
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
		No atual = primeiro;
		while (atual != null) {
			temp += atual.getDado() + ", ";
			atual = atual.getProximo();
		}
		temp += ">";
		return temp;
	}
	
	public String localizar(String conteudo) {
		if (Vazia()) {
			return null;
		}
		No aux = primeiro;
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
