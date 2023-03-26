package recursion.stairs;

public class Stairs {

    private final int length;

    public Stairs(int tamanho) {
        this.length = tamanho;
    }

    public void print() {
        print(0, 0);
    }

    private void print(int x, int y) {

        if (x == this.length) {return;}

        if (y < this.length - 1) {
            print(x, y+1);
        } else {
            print(x+1, 0);
        }

        if (x!=y && y == this.length - 1) {
            System.out.println();
        }

        if (x == y) {
            System.out.print("$");
        } else {
            System.out.print("#");
        }
    }
}
