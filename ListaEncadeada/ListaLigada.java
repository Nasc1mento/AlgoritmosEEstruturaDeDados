package ListaEncadeada;

public class ListaLigada {
	private No primeiro;
	private No ultimo;
	private String nomeDaLista;

	public ListaLigada(String nome) {
		nomeDaLista = nome;
		primeiro = ultimo = null;
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
			ultimo.setProximo(primeiro);
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

	public boolean Vazia() {
		return primeiro == null;
	}
}
