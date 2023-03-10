
/*
 * Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * Aluno: Adryan Nascimento Reis 
 * 
 * 
 * 
 * 
 * Exercício2 - Um problema típico em ciência da computação consiste em converter um número da sua forma
 * decimal para a forma binária. Por exemplo, o número 12 tem a sua representação binária igual a
 * 1100. A forma mais simples de fazer isso é dividir o número sucessivamente por 2, onde o resto
 * da i-ésima divisão vai ser o dígito i do número binário (da direita para a esquerda).
 * Por exemplo: 12 / 2 = 6, resto 0 (1o dígito da direita para esquerda), 6 / 2 = 3, resto 0 (2o
 * dígito da direita para esquerda), 3 / 2 = 1 resto 1 (3o dígito da direita para esquerda), 1 / 2
 * = 0 resto 1 (4o dígito da direita para esquerda). Resultado: 12 = 1100
 * Escreva um procedimento recursivo Dec2Bin(n: integer) que dado um número decimal
 * imprima a sua representação binária corretamente.
 * 
 * 
 */

package Recursao.ListaDeExercicios.Exercicio2;

public class DecimalParaBinario {
	
	
	public static void decToBin(int n) {
		
		if (n == 0) {System.out.println(0); return; }
		if (n == 1) {System.out.print(1); return; }
		decToBin(n / 2);
		System.out.print(n % 2);
			
		
	}
	
	
	public static void main(String[] args) {
		decToBin(15);
	}
}
