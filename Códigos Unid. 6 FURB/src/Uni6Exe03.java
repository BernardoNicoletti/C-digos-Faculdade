import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        new Uni6Exe03();
    }

    public Uni6Exe03() {
        Scanner teclado = new Scanner(System.in);
        double[] valores = new double[12];
        double aumento2 = 0.02, aumento5 = 0.05;
        ler(valores, teclado);
        organizar(valores, aumento2, aumento5);
        retornaVetor(valores);
        teclado.close();
    }

    private void ler(double[] valores, Scanner teclado) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o " + (i + 1) + " º valor");
            valores[i] = teclado.nextDouble();
        }
    }

    private void organizar(double[] valores, double aumento2, double aumento5) {
        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                valores[i] += valores[i] * aumento2;
            } else {
                valores[i] += valores[i] * aumento5;
            }
        }
    }

    private void retornaVetor(double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

}
