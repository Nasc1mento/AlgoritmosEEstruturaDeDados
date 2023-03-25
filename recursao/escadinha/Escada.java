package recursao.escadinha;

public class Escada {

    private final int tamanho;

    public Escada(int tamanho) {
        this.tamanho = tamanho;
    }

    public void imprimir_escada() {
        imprimir_escada(0, 0);
    }

    private void imprimir_escada(int x, int y) {

        if (x == this.tamanho) {return;}

        if (y < this.tamanho - 1) {
            imprimir_escada(x, y+1);
        } else {
            imprimir_escada(x+1, 0);
        }

        if (x!=y && y == this.tamanho - 1) {
            System.out.println();
        }

        if (x == y) {
            System.out.print("$");
        } else {
            System.out.print("#");
        }
    }
}
