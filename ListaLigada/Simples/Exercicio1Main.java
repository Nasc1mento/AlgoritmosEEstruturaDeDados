
/*
 * Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * Aluno: Adryan Nascimento Reis 
 * 
 *
 *
 *
 */
package ListaLigada.Simples;

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
		// a) Localize/ Pesquise/Encontre (search) elementos
		System.out.println("----------------Localize/ Pesquise/Encontre (search) elementos------------------");
		System.out.println(lg.exist("a"));
		System.out.println(lg.exist("b"));
		System.out.println(lg.exist("c"));
		System.out.println(lg.exist("d"));
		System.out.println(lg.exist("e"));
		System.out.println(lg.exist("r"));
		System.out.println(lg.length());		
		// b) Concatenar/intercalar (Merge) duas listas
		System.out.println("---------------------Concatenar/intercalar (Merge) duas listas-------------------");
		ListaLigada<Object>lg2 = new ListaLigada<>();
		lg2.addFirst("xyz");
		lg2.addFirst("abc");
		lg2.addFirst("catapult dragon");
		System.out.println(lg2.list());
		System.out.println(lg.concat(lg2));;
		System.out.println(lg2);
		// c) Dividir uma lista em várias (k)
		System.out.println("----------------------Dividir uma lista em várias (k)----------------------------");
		ListaLigada<Object> numeros = new ListaLigada<Object>();
		numeros.addLast(1);
		numeros.addLast(2);
		numeros.addLast(3);
		numeros.addLast(4);
		numeros.addLast(5);
		ListaLigada<ListaLigada<Object>> dividida = numeros.divideList(3);
		No<ListaLigada<Object>> l1 = dividida.getNodeByIndex(0);
		No<ListaLigada<Object>> l2 = dividida.getNodeByIndex(1);
		No<ListaLigada<Object>> l3 = dividida.getNodeByIndex(2);
		System.out.println(l1.getContent().list());
		System.out.println(l2.getContent().list());
		System.out.println(l3.getContent().list());
		System.out.println(dividida.length());
		// d) Copiar uma lista
		System.out.println("-------------------------Copiar uma lista----------------------------------------");
		ListaLigada<Object> copia = lg.copy();
		System.out.println(lg);
		System.out.println(copia);
		System.out.println(lg.list());
		System.out.println(copia.list());
		System.out.println(lg);
		System.out.println(lg.list());
		System.out.println(lg.getNodeByIndex(0).getContent());
		

	}
}
