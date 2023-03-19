package ListaLigada;

public class No <T>{

	private T conteudo;
	private No<T> proximo;

	public No(T dadonovo) {
		this.conteudo = dadonovo;
		this.proximo = null;
	}

	public No(T dadonovo, No<T> ligacao) {
		this.conteudo = dadonovo;
		this.proximo = ligacao;
	}

	public No<T> getProximo() {
		return this.proximo;
	}

	public void setProximo(No<T> no) {
		this.proximo = no;
	}

	public T getDado() {
		return this.conteudo;
	}

}
