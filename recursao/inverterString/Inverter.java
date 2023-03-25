package recursao.inverterString;

public class Inverter {

    public String texto;


    public Inverter (String texto) {
        this.texto = texto;
    }

    public void imprimir_inverso() {
        imprimir_inverso(0);
    }
    private void imprimir_inverso(int a) {
        if (a < texto.length() - 1) {
            imprimir_inverso(a+1);
        }
        System.out.print(texto.charAt(a));
    }
}
