import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        new Uni6Exe02();
    }

    public Uni6Exe02() {
        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[12];
        double media = 0;
        ler(notas, teclado);
        media = retornarMedia(notas, media);
        notasAcima(notas, media);
        teclado.close();
    }

    private void ler(double[] notas, Scanner teclado) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + " º nota");
            notas[i] = teclado.nextDouble();
        }
    }

    private double retornarMedia(double[] notas, double media) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        media = soma / notas.length;
        return media;
    }

    private void notasAcima(double[] notas, double media) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[1] > media) {
                System.out.println(notas[i]);
            }
        }
    }
}