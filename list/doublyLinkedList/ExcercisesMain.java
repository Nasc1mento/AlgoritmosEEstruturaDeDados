package list.doublyLinkedList;

public class ExcercisesMain {
	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
		l.addFirst(2);
		l.addLast(3);
		l.addFirst(7);
		l.addLast(8);
		System.out.println(l.list());
	}
}
