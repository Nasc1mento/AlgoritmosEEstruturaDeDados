package ListaEncadeada;

public class No {
	
	private String conteudo;
	private No proximo;
	
	public No getProximo() {
		return this.proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	public String getDado() {
		return this.conteudo;
	}

	public No(String dadonovo) {
		this.conteudo = dadonovo;
		this.proximo = null;
	}
	public No(String dadonovo, No ligacao) {
		this.conteudo = dadonovo;
		this.proximo = ligacao;
	}
}
