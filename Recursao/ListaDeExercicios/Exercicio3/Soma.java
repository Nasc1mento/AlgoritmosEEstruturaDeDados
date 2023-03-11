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
package Recursao.ListaDeExercicios.Exercicio3;

public class Soma {
	
	public static int sucessor(int n) {
		return ++n;		
	}
	
	public static int predecessor(int n) {		
		return --n;		
	}
	
	public static int soma(int x, int y) {
		if (y != 0) {
			return soma(sucessor(x), predecessor(y));
		}	
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(soma(202,202));
	}
}
