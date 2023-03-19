package ListaLigada.Simples;

public class No <T>{

	private T conteudo;
	private No<T> proximo;

	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximo = null;
	}

	public No(T conteudo, No<T> proximo) {
		this.conteudo = conteudo;
		this.proximo = proximo;
	}

	public No<T> getProximo() {
		return this.proximo;
	}

	public void setProximo(No<T> no) {
		this.proximo = no;
	}

	public T getConteudo() {
		return this.conteudo;
	}

}
