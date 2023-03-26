package lista.listaDuplamenteLigada;

public class No <T> {
	
	private No<T> previous;
	private No<T> next;
	private T data;
	
	
	
	public No(T data){
		this.previous = null;
		this.next = null;
		this.data = data;
	}
	
	public No(No<T> previous, No<T> next, T data) {
		this.previous = previous;
		this.next = next;
		this.data = data;
	}
	
	public void setNext(No<T> next){
		this.next = next;
	}
	
	public No<T> getnext(){
		return this.next;
	}
	
	public void setPrevious(No<T> previous) {
		this.previous = previous;
	}
	
	public No<T> getPrevious() {
		return this.previous;
	}
	
	
	public T getData() {
		return this.data;
	}
	
	
}
