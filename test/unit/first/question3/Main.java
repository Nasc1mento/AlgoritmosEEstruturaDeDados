package test.unit.first.question3;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Atendimento em uma concessionária baseado em uma lista ligada\n"
				+ "para a avaliação da 1ª unidade de Algoritmos e Estrutura de Dados.\n"
				+ "Alunos: Adryan Nascimento e Antônio Pedro\n");
		Thread.sleep(1000);
		new Dealership().action();
		System.out.println("\nFim !!!");
	}
}
