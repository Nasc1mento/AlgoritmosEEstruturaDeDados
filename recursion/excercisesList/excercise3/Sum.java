/*
 * Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * Aluno: Adryan Nascimento Reis 
 * 
 * 
 * 
 * Exercicio 3 - Considere um sistema numérico que não tenha a operação de adição implementada e que vc
 * disponha somente dos operadores (funções) sucessor e predecessor. Então, pede-se para escrever
 * uma função recursiva que calcule a soma de dois números x e y através desses dois operadores:
 * sucessor e predecessor.
 * 
 * 
 */
package recursion.excercisesList.excercise3;

public class Sum {
	
	public static int sucessor(int n) {
		return ++n;		
	}
	
	public static int predecessor(int n) {		
		return --n;		
	}
	
	public static int sum(int x, int y) {
		if (y != 0) {
			return sum(sucessor(x), predecessor(y));
		}	
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(202,202));
	}
}
