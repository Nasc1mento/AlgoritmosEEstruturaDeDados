
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

public class Main {
	
	
	
	public static void main(String[] args) {
		//Exercício 01
		ListaLigada<Object>lg = new ListaLigada<>();
		lg.insereNoFundo("a");
		lg.insereNoFundo("b");
		lg.insereNoFundo("c");
		lg.insereNaFrente("r");
		lg.insereNaFrente(5);
		lg.insereNoFundo(2.99);
		System.out.println(lg);
		System.out.println(lg.getTamanho());
		// Localize/ Pesquise/Encontre (search) elementos
		System.out.println(lg.localizar("a"));
		System.out.println(lg.localizar("b"));
		System.out.println(lg.localizar("c"));
		System.out.println(lg.localizar("d"));
		System.out.println(lg.localizar("e"));
		System.out.println(lg.localizar("r"));
		System.out.println(lg.getTamanho());		
		// Concatenar/intercalar (Merge) duas listas
		ListaLigada<Object>lg2 = new ListaLigada<>();
		lg2.insereNaFrente("xyz");
		lg2.insereNaFrente("abc");
		lg2.insereNaFrente("catapult dragon");
		System.out.println(lg2);
		System.out.println(lg.concatenar(lg2));;
		System.out.println(lg2);
		// Dividir uma lista em várias (k)
		
	}
}
