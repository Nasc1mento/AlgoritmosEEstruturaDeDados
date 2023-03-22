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
			primeiro = ultimo = new No<T>(item);
		else
			primeiro = new No<>(item, primeiro);
	}

	public void insereNoFundo(T item) {
		
		if (vazia())
			primeiro = ultimo = new No<T>(item);
		else {
			ultimo.setProximo(new No<T>(item));
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
	
	public ListaLigada<ListaLigada<T>> divdirListaEmN (int n) {
		
		ListaLigada<ListaLigada<T>> listas = new ListaLigada<ListaLigada<T>>();
		int tamanho = this.getTamanho();
		int parte = tamanho / n;
		int restante = tamanho % n;
		No<T> temp = primeiro;
		
		for (int i = 0; i < n; i++ ) {
			int tamanhoAtual = parte + (i < restante ? 1 : 0);
			ListaLigada<T> lista = new ListaLigada<T>();
			for (int j = 0; j < tamanhoAtual; j++) {
				lista.insereNoFundo(temp.getConteudo());
				temp = temp.getProximo();
			}
			listas.insereNoFundo(lista);
		}
		return listas;
	}
	
	public boolean vazia() {
		return primeiro == null;
	}
}
