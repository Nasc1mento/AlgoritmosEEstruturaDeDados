package tree.binary;

import javax.swing.JOptionPane;

/**
 * @Professor Milton Secundino
 * @Exercicio Implementação de Lista Ligada para a disciplina de Algorítmos e
 *            Estrutura de Dados
 * 
 * 
 *            Com a expansão dos Campi do IFPE, o número de estudantes
 *            matriculados tem aumentado significativamente. Como consequência,
 *            o sistema acadêmico começou apresentar constante lentidão nas
 *            funcionalidades e busca por dados dos estudantes. Diante desse
 *            problema, a reitoria do IFPE entrou em contato com os estudantes
 *            de algoritmos e estruturas de dados para desenvolverem uma solução
 *            para o problema. Prontamente os estudantes resolveram implementar,
 *            em JAVA, índice em forma de árvore binária para os identificadores
 *            dos estudantes. Operações realizadas: 1. INSERT {ID}: Insere o
 *            número {ID} na árvore de busca binária; 2. SEARCH {ID}: Busca pelo
 *            o número {ID} na árvore de busca binária, imprime true se o
 *            elemento estiver na árvore, ou false caso contrário; 3. RESET:
 *            remove todos os elementos da árvore de busca binária. Observação:
 *            não é necessário preocupar-se com o balanceamento da árvore.
 *            Exemplos de entrada: INSERT 20 INSERT 15 INSERT 18 INSERT 25
 *            INSERT 60 INSERT -4 SEARCH 18 SEARCH 75 RESET INSERT 60 SEARCH 7
 * 
 *            Saída correspondente no console:
 * 
 *            true false false
 * 
 *            Observações e dicas importantes: ● Não serão aceitas soluções que
 *            utilizem as implementações dos algoritmos de inserção, busca e
 *            impressão em bibliotecas da linguagem utilizada para escrever sua
 *            resposta. Ou seja: nada de "implementações prontas" - construam
 *            tudo "na munheca" (lembrem dos pseudocódigos presentes nos slides
 *            - podem ajudar muito). ● Teste seu código com diversos casos
 *            distintos.
 *
 */
public class Excercise {
	public static void main(String[] args) throws DuplicateValueException{
		Tree<Integer> tree = new Tree<>();
		try {
			tree.insert(20);
			tree.insert(15);
			tree.insert(18);
			tree.insert(25);
			tree.insert(60);
			tree.insert(-4);
//			tree.print();
			System.out.println(tree.search(18));
			System.out.println(tree.search(75));
			tree.reset();
			tree.insert(60);
			System.out.println(tree.search(7));		
		}catch (DuplicateValueException e) {
			e.printStackTrace();
		}
	}
}
