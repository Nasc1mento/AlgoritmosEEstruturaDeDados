package Recursao.Escadinha;

public class Escada {

    private final int tamanho;
    private final int x;
    private final int y;

    public Escada(int tamanho) {
        this.tamanho = tamanho;
        this.x = 0;
        this.y = 0;
    }

    public void imprimir_escada() {
        imprimir_escada(this.x, this.y);
    }

    private void imprimir_escada(int x, int y) {

        if (x == tamanho) {return;}

        if (x < tamanho && y < tamanho - 1) {
            imprimir_escada(x, y+1);
        } else {
            imprimir_escada(x+1, 0);
        }

        if (x!=y && y == tamanho -1) {
            System.out.println();
        }

        if (x == y) {
            System.out.print("$");
        } else {
            System.out.print("#");
        }
    }
}
