package list.simplyLinkedList;
/**Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * @author Adryan Nascimento Reis 
 * 
 *Exercicio sobre Lista Simplesmente Ligada
 *
 *
 */
public class ExcercisesMain {
	
	
	
	public static void main(String[] args) {
		//Exercício 01
		SimplyLinkedList<Object>lg = new SimplyLinkedList<Object>();
		lg.addLast("a");
		lg.addLast("b");
		lg.addLast("c");
		lg.addFirst("r");
		lg.addFirst(5);
		lg.addLast(2.99);
		System.out.println(lg);
		System.out.println(lg.length());
		// Localize/ Pesquise/Encontre (search) elementos
		System.out.println("----------------Localize/ Pesquise/Encontre (search) elementos------------------");
		System.out.println(lg.contains("a"));
		System.out.println(lg.contains("b"));
		System.out.println(lg.contains("c"));
		System.out.println(lg.contains("d"));
		System.out.println(lg.contains("e"));
		System.out.println(lg.contains("r"));
		System.out.println(lg.length());		
		// Concatenar/intercalar (Merge) duas listas
		System.out.println("---------------------Concatenar/intercalar (Merge) duas listas-------------------");
		SimplyLinkedList<Object>lg2 = new SimplyLinkedList<Object>();
		lg2.addFirst("xyz");
		lg2.addFirst("abc");
		lg2.addFirst("catapult dragon");
		System.out.println(lg2.list());
		System.out.println(lg.concat(lg2));;
		System.out.println(lg.list());
		// Dividir uma lista em várias (k)
		System.out.println("----------------------Dividir uma lista em várias (k)----------------------------");
		SimplyLinkedList<Integer> numeros = new SimplyLinkedList<Integer>();
		numeros.addLast(1);
		numeros.addLast(2);
		numeros.addLast(3);
		numeros.addLast(4);
		numeros.addLast(5);
		SimplyLinkedList<SimplyLinkedList<Integer>> dividida = numeros.divideList(3);
		SimplyLinkedList<Integer> l1 = dividida.getContentByIndex(0);
		SimplyLinkedList<Integer> l2 = dividida.getContentByIndex(1);
		SimplyLinkedList<Integer> l3 = dividida.getContentByIndex(2);
		System.out.println(dividida.list());
		System.out.println(l1.list());
		System.out.println(l2.list());
		System.out.println(l3.list());
		System.out.println(dividida.length());
		System.out.println(l1.indexOf(2));
		System.out.println(l1.indexOf(1));		
		// Copiar uma lista
		System.out.println("-------------------------Copiar uma lista----------------------------------------");
		SimplyLinkedList<Object> copia = lg.copy();
		System.out.println(lg);
		System.out.println(copia);
		System.out.println(lg.list());
		System.out.println(copia.list());
		System.out.println(lg);
		System.out.println(lg.list());
		System.out.println(lg.getContentByIndex(0));
		System.out.println("-----Escreva uma rotina em Java para trocar os elementos m e n de uma lista.-----");
		SimplyLinkedList<Character> letras = new SimplyLinkedList<Character>();
		letras.addLast('a');
		letras.addLast('b');
		letras.addLast('c');
		letras.addLast('d');
		System.out.println(letras.list());
		System.out.println(letras.getNodeByIndex(4));
		letras.swapElements(1, 3);
		System.out.println(letras.list());
		letras.swapElements(1, 2);
		System.out.println(letras.list());
		System.out.println("-----Escreva uma rotina em Java para trocar os elementos de índice m e n de uma lista..-----");
		letras.swapIndexes(1, 2);
		System.out.println(letras.list());
		System.out.println("-----------Menor número no inicio da lista usando os ponteiros--------------");
		numeros.addLast(-1);
		numeros.addLast(-10);
		numeros.addLast(10);
		numeros.addLast(-11);
		numeros.addLast(11);
		System.out.println(numeros.list());		
		numeros.minorFirst();
		System.out.println(numeros.list());
		System.out.println("---------Inverter uma lista usando os ponteiros-----------");
		numeros.reverse();
		System.out.println(numeros.list());
		numeros.removeAt(9);
		numeros.addLast(100);
		System.out.println(numeros.list());
		numeros.insertAt(1, 111);
		System.out.println(numeros.list());
	}
}
