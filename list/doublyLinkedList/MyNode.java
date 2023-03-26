package list.doublyLinkedList;

public class MyNode <T> {
	
	private MyNode<T> previous;
	private MyNode<T> next;
	private T data;
	
	
	
	public MyNode(T data){
		this.previous = null;
		this.next = null;
		this.data = data;
	}
	
	public MyNode(MyNode<T> previous, MyNode<T> next, T data) {
		this.previous = previous;
		this.next = next;
		this.data = data;
	}
	
	public void setNext(MyNode<T> next){
		this.next = next;
	}
	
	public MyNode<T> getnext(){
		return this.next;
	}
	
	public void setPrevious(MyNode<T> previous) {
		this.previous = previous;
	}
	
	public MyNode<T> getPrevious() {
		return this.previous;
	}
	
	
	public T getData() {
		return this.data;
	}
	
	
}
