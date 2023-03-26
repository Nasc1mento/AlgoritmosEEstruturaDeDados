package lista.listaSimplismenteLigada;
/**
 * Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * @author Adryan Nascimento Reis 
 * 
 *<pre>Exercicio sobre Lista Ligada Simples</pre>
 *
 *
 */
public class ExerciciosMain {
	
	
	
	public static void main(String[] args) {
		//Exercício 01
		ListaSimplismenteLigada<Object>lg = new ListaSimplismenteLigada<Object>();
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
		ListaSimplismenteLigada<Object>lg2 = new ListaSimplismenteLigada<Object>();
		lg2.addFirst("xyz");
		lg2.addFirst("abc");
		lg2.addFirst("catapult dragon");
		System.out.println(lg2.list());
		System.out.println(lg.concat(lg2));;
		System.out.println(lg.list());
		// Dividir uma lista em várias (k)
		System.out.println("----------------------Dividir uma lista em várias (k)----------------------------");
		ListaSimplismenteLigada<Integer> numeros = new ListaSimplismenteLigada<Integer>();
		numeros.addLast(1);
		numeros.addLast(2);
		numeros.addLast(3);
		numeros.addLast(4);
		numeros.addLast(5);
		ListaSimplismenteLigada<ListaSimplismenteLigada<Integer>> dividida = numeros.divideList(3);
		ListaSimplismenteLigada<Integer> l1 = dividida.getContentByIndex(0);
		ListaSimplismenteLigada<Integer> l2 = dividida.getContentByIndex(1);
		ListaSimplismenteLigada<Integer> l3 = dividida.getContentByIndex(2);
		System.out.println(dividida.list());
		System.out.println(l1.list());
		System.out.println(l2.list());
		System.out.println(l3.list());
		System.out.println(dividida.length());
		System.out.println(l1.indexOf(2));
		System.out.println(l1.indexOf(1));		
		// Copiar uma lista
		System.out.println("-------------------------Copiar uma lista----------------------------------------");
		ListaSimplismenteLigada<Object> copia = lg.copy();
		System.out.println(lg);
		System.out.println(copia);
		System.out.println(lg.list());
		System.out.println(copia.list());
		System.out.println(lg);
		System.out.println(lg.list());
		System.out.println(lg.getContentByIndex(0));
		System.out.println("-----Escreva uma rotina em Java para trocar os elementos m e n de uma lista.-----");
		ListaSimplismenteLigada<Character> letras = new ListaSimplismenteLigada<Character>();
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
	}
}
