package list.doublyLinkedList;

public class ExcercisesMain {
	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> l = new DoublyLinkedList<Integer>();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addLast(6);
		l.addLast(7);
		l.addLast(8);
		System.out.println(l.list());
		l.insertAt(1, 100);
		System.out.println(l.list());
		l.removeAt(1);
		System.out.println(l.list());
		l.removeLast();
		l.removeFirst();
		System.out.println(l.list());
	}
}
