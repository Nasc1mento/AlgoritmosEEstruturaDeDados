/*
 * Instituto Federal de Educação, Ciência e Tecnologia de Pernambuco - Campus Igarassu
 * Componente Curricular: Algorítmos e Estrutura de Dados
 * Professor: Milton Secundino
 * Aluno: Adryan Nascimento Reis 
 * 
 * 
 * 
 * Exercício 4 - O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se
 * uma definição recursiva:
 * MDC(x, y) = MDC(x − y, y), se x > y . Além disso, sabe-se que:
 * MDC(x, y) = MDC( y, x) MDC(x, x) = x
 * Exemplo:
 * MDC(10,6) = MDC(4,6) = MDC(6,4) = MDC(2,4) = MDC(4,2) = MDC(2,2) = 2
 * Então, pede-se que seja criada uma função recursiva para descrever tal definição. Crie, também,
 * um algoritmo que leia os dois valores inteiros e utilize a função criada para calcular o MDC de x
 * e y, e imprima o valor computado.
 * 
 * 
 */
package recursao.listaDeExercicios.exercicio4;

public class MaximoDivisorComum {
	
	
	public static int mdc(int x, int y) {
		if (y > x)
			return mdc(y, x);
		else if (x == y)
			return x;
		else 
			return mdc(x-y, y);	
	}
	
	public static void main(String[] args) {
		System.out.println(mdc(10, 6));
	}
}
