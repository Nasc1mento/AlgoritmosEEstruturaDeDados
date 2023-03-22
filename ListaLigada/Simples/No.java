package ListaLigada.Simples;

public class No <T>{

	private T content;
	private No<T> next;

	public No(T content) {
		this.content = content;
		this.next = null;
	}

	public No(T content, No<T> next) {
		this.content = content;
		this.next = next;
	}

	public No<T> getNext() {
		return this.next;
	}

	public void setNext(No<T> no) {
		this.next = no;
	}

	public T getContent() {
		return this.content;
	}

}
