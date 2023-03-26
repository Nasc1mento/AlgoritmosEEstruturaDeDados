package list.doublyLinkedList;
/**Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * @author Adryan Nascimento Reis 
 * 
 *Exercicio sobre Lista Duplamente Ligada
 *
 *
 */
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
		l.removeFirst();
		System.out.println(l.list());
		DoublyLinkedList<Integer> l2 = new DoublyLinkedList<Integer>();
		l2.addLast(10);
		l2.addLast(20);
		l2.addLast(30);
		l2.addLast(40);
		l2.addLast(50);
		l2.addLast(60);
		l2.addLast(70);
		l2.addLast(80);
		l2.removeLast();
		l2.removeAt(4);
		l.concat(l2);
		System.out.println(l2.list());
		System.out.println(l.list());
	}
}
