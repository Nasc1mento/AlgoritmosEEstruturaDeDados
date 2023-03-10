
/*
 * Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * Aluno: Adryan Nascimento Reis 
 * 
 * 
 * 
 * 
 * Exercício 01 - Implemente uma função recursiva que, dados dois números inteiros x e n, calcula o valor de x**n
 * 
 * 
 */

package Recursao.ListaDeExercicios.Exercicio1;

public class Exponenciacao {
	
	public static int expoenenciacao(int x, int n) {
		if (n <= 1) {
			return x;
		}
		
		return x * expoenenciacao(x, n-1);
	}
	
	public static void main(String[] args) {
		int resposta = expoenenciacao(5, 4);
		System.out.println(resposta);
	}
}

