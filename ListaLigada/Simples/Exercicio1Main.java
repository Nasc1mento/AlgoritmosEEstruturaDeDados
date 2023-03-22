package ListaLigada.Simples;
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
public class Exercicio1Main {
	
	
	
	public static void main(String[] args) {
		//Exercício 01
		ListaLigada<Object>lg = new ListaLigada<Object>();
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
		ListaLigada<Object>lg2 = new ListaLigada<Object>();
		lg2.addFirst("xyz");
		lg2.addFirst("abc");
		lg2.addFirst("catapult dragon");
		System.out.println(lg2.list());
		System.out.println(lg.concat(lg2));;
		System.out.println(lg.list());
		// Dividir uma lista em várias (k)
		System.out.println("----------------------Dividir uma lista em várias (k)----------------------------");
		ListaLigada<Integer> numeros = new ListaLigada<Integer>();
		numeros.addLast(1);
		numeros.addLast(2);
		numeros.addLast(3);
		numeros.addLast(4);
		numeros.addLast(5);
		ListaLigada<ListaLigada<Integer>> dividida = numeros.divideList(3);
		ListaLigada<Integer> l1 = dividida.getContentByIndex(0);
		ListaLigada<Integer> l2 = dividida.getContentByIndex(1);
		ListaLigada<Integer> l3 = dividida.getContentByIndex(2);
		System.out.println(dividida.list());
		System.out.println(l1.list());
		System.out.println(l2.list());
		System.out.println(l3.list());
		System.out.println(dividida.length());
		System.out.println(l1.indexOf(2));
		System.out.println(l1.indexOf(1));		
		// Copiar uma lista
		System.out.println("-------------------------Copiar uma lista----------------------------------------");
		ListaLigada<Object> copia = lg.copy();
		System.out.println(lg);
		System.out.println(copia);
		System.out.println(lg.list());
		System.out.println(copia.list());
		System.out.println(lg);
		System.out.println(lg.list());
		System.out.println(lg.getContentByIndex(0));
		System.out.println("-----Escreva uma rotina em Java para trocar os elementos m e n de uma lista.-----");
		ListaLigada<Character> letras = new ListaLigada<Character>();
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
		
	}
}
