package sort.bubble;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * A casa do artesão, localizada no sítio histórico de Igarassu, vem tentando automatizar o armazenamento do seu estoque e recentemente adquiriu um Robô capaz de empilhar as caixas com produtos vendidos na loja. Porém, antes de empilhá-las o Robô precisa ordená-las da menos pesada para a mais pesada. Então a administração da casa entrou em contato com o Campus Igarassu para implementar o código de ordenação das caixas conforme as seguintes especificações:

Operações realizadas pelo robô:
SORT {SIZE} {ARRAY}: Ordena todos os elementos de {ARRAY} do menor para o maior (cada elemento representa o peso da caixa).

A ordenação deve ser implementada através do algoritmo bubble sort com a otimização de parar a execução quando o array já estiver ordenado.

O arquivo de saída deve mostrar as etapas intermediárias da ordenação toda vez que o algoritmo chegar ao fim do array (ver exemplo de saída).

Exemplos de arquivo da entrada:

SORT 5 7 4 6 0 8
SORT 3 3 2 1

Saída correspondente no console:

4 6 0 7 8
4 0 6 7 8
0 4 6 7 8
2 1 3
1 2 3




Cada estudante deve postar a sua resposta na sala da turma no Google Classroom em um único arquivo, cujo nome é a letra A seguida sua matrícula e a extensão é correspondente ao código da linguagem utilizada no código.

Exemplo para um código escrito em C: A20201TSIIG1234.c
Exemplo para um código escrito em Javascript: A20201TSIIG1234.js
Exemplo para um código escrito em Python: A20201TSIIG1234.py

Para testar a implementação serão realizados testes utilizando um ou mais arquivos de entrada chamados input.txt. 

A saída do programa no console após a execução do arquivo input.txt será comprada com um arquivo de gabarito correspondente.

Observações e dicas importantes:
Pesquise sobre como ler arquivos de texto na linguagem que for utilizar para implementar sua resposta (normalmente, com uma única linha você pode ler o arquivo inteiro como uma string ou um array de strings);
Não se preocupe em imprimir a saída em um arquivo, meu programa de correção já irá redirecionar a saída do console para um arquivo;
Há dois arquivos de exemplo no material da aula representando uma exemplo de entrada e outro de saída correspondente à entrada;
Só serão aceitas implementações do bubble sort;
Não serão aceitas resposta que utilizem as implementações do bubble sort em bibliotecas da linguagem utilizada para escrever sua resposta;
Teste seu código com diversos casos distintos, não se limitando ao exemplo de entrada, porque as respostas serão com os casos mais diversos.


 * @author Adryan Nascimento Reis
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i-1]) {
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					sorted = false;
				}
			}
			if (!sorted)
				printArray(arr);
		}				
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
	        if (i < arr.length - 1) {
	            System.out.print(" ");
	        }
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader myreader = new BufferedReader(new FileReader("sort/bubble/input100.txt"));
			String line = myreader.readLine();
			int [] array;
			while (line != null) {
				String[] num = (line.split(" "));
				array = new int[Integer.parseInt(num[1])];			
				for (int i = 0; i < array.length; i++) {
					array[i] = Integer.parseInt(num[2+i]);
				}			
				bubbleSort(array);				
				line = myreader.readLine();
			}
			myreader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
