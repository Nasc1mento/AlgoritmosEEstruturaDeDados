
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
		// a) Localize/ Pesquise/Encontre (search) elementos
		System.out.println("----------------Localize/ Pesquise/Encontre (search) elementos------------------");
		System.out.println(lg.localizar("a"));
		System.out.println(lg.localizar("b"));
		System.out.println(lg.localizar("c"));
		System.out.println(lg.localizar("d"));
		System.out.println(lg.localizar("e"));
		System.out.println(lg.localizar("r"));
		System.out.println(lg.getTamanho());		
		// b) Concatenar/intercalar (Merge) duas listas
		System.out.println("---------------------Concatenar/intercalar (Merge) duas listas-------------------");
		ListaLigada<Object>lg2 = new ListaLigada<>();
		lg2.insereNaFrente("xyz");
		lg2.insereNaFrente("abc");
		lg2.insereNaFrente("catapult dragon");
		System.out.println(lg2.listar());
		System.out.println(lg.concatenar(lg2));;
		System.out.println(lg2);
		// c) Dividir uma lista em várias (k)
		System.out.println("----------------------Dividir uma lista em várias (k)----------------------------");
		ListaLigada<Object> numeros = new ListaLigada<Object>();
		numeros.insereNoFundo(1);
		numeros.insereNoFundo(2);
		numeros.insereNoFundo(3);
		numeros.insereNoFundo(4);
		numeros.insereNoFundo(5);
		ListaLigada<ListaLigada<Object>> dividida = numeros.divdirListaEmN(3);
		No<ListaLigada<Object>> l1 = dividida.getNoByIndice(0);
		No<ListaLigada<Object>> l2 = dividida.getNoByIndice(1);
		No<ListaLigada<Object>> l3 = dividida.getNoByIndice(2);
		System.out.println(l1.getConteudo().listar());
		System.out.println(l2.getConteudo().listar());
		System.out.println(l3.getConteudo().listar());
		System.out.println(dividida.getTamanho());
		// d) Copiar uma lista
		System.out.println("-------------------------Copiar uma lista----------------------------------------");
		ListaLigada<Object> copia = lg.copiar();
		System.out.println(lg);
		System.out.println(copia);
		System.out.println(lg.listar());
		System.out.println(copia.listar());
		System.out.println(lg);
		System.out.println(lg.listar());
		System.out.println(lg.getNoByIndice(0).getConteudo());
		

	}
}
