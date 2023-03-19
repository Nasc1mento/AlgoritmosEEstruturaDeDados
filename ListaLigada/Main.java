
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
package ListaLigada;

public class Main {
	
	
	
	public static void main(String[] args) {
//		Exercício 01
		ListaLigada<Object>lg = new ListaLigada<>();
		lg.InsereNoFundo("a");
		lg.InsereNoFundo("b");
		lg.InsereNoFundo("c");
		lg.InsereNaFrente("r");
		lg.InsereNaFrente(5);
		System.out.println(lg);
		
		// Localize/ Pesquise/Encontre (search) elementos
		System.out.println(lg.localizar("a"));
		System.out.println(lg.localizar("b"));
		System.out.println(lg.localizar("c"));
		System.out.println(lg.localizar("d"));
		System.out.println(lg.localizar("e"));
		System.out.println(lg.localizar("r"));
		
		//Dividir uma lista em várias (k)
		
		
	}
}
