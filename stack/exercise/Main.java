package stack.exercise;

/**
 * A casa do artesão, localizada no sítio histórico de Igarassu, vem tentando automatizar o armazenamento do seu estoque e recentemente adquiriu um Robô capaz de empilhar as caixas com produtos vendidos na loja. Infelizmente, o Robô comprado não vem com nenhum software para empilhar as caixas. Então a administração da casa entrou em contato com o Campus Igarassu para implementar o código de empilhamento conforme as seguintes especificações:

Operações realizadas pelo robô:
PUSH {ID}: adiciona uma caixa com o {ID} na pilha
POP: remove a caixa no topo da pilha
STATE: imprime o estado da pilha
a impressão deve ser feita numa única linha com todos os elementos separados por espaço
ao final da linha deverá ser impressa uma quebra de linha
veja o exemplo abaixo para mais detalhes
RESET: remove todos os elementos da pilha

Cada estudante deve postar a sua resposta na sala da turma no Google Classroom em um único arquivo, cujo nome é sua matrícula e a extensão é correspondente ao código da linguagem utilizada no código.

Exemplo para um código escrito em C: 20201TSIIG1234.c
Exemplo para um código escrito em Javascript: 20201TSIIG1234.js
Exemplo para um código escrito em Python: 20201TSIIG1234.py

Para testar a implementação serão realizados testes utilizando um ou mais arquivos de entrada chamados input.txt. 

A saída do programa no console após a execução do arquivo input.txt será comprada com um arquivo de gabarito correspondente.

Exemplos de arquivo da entrada:

PUSH 5
PUSH 6
PUSH 7
PUSH 1
PUSH 3
POP
POP
PUSH 8
STATE
RESET
PUSH 4
PUSH 3
POP
STATE

Saída correspondente no console:

8 7 6 5
4 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import stack.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		try {
			BufferedReader myreader = new BufferedReader(new FileReader("stack/exercise/input.txt"));
			String line = myreader.readLine();
			while (line != null) {
				String[] words = line.split(" ");
				if(words.length > 1) {
					pilha.push(words[1]);
//					System.out.println(words[1]);
				}else if (words[0].equals("STATE")) {
					System.out.println(pilha.state());
				}else if(words[0].equals("POP")) {
					pilha.pop();
				}else if(words[0].equals("RESET")){
					pilha.reset();
				}
				line = myreader.readLine();
			}
//			System.out.println(pilha.state());
			myreader.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
