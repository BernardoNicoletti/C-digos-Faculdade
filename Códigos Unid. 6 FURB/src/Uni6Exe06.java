import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        new Uni6Exe06();
    }

    Uni6Exe06() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int N = teclado.nextInt();
        double[] vetor = new double[N];
        readValues(vetor, teclado);
        System.out.print("Digite um valor para verificar se existe no vetor: ");
        double valor = teclado.nextDouble();
        String vouf = "falso";
        vouf = returnVouF(vetor, valor, vouf);
        System.out.println("Valor encontrado: " + vouf);
        teclado.close();
    }

    private void readValues(double[] vetor, Scanner input) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor da posição [" + i + "] do vetor");
            vetor[i] = input.nextDouble();
        }
    }

    private String returnVouF(double[] vetor, double valor, String vouf) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                vouf = "verdadeiro";
            }
        }
        return vouf;
    }
}