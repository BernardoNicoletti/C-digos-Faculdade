import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        new Uni6Exe04();
    }

    public Uni6Exe04() {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        lerVetores(vetor2, vetor1, teclado);
        completaVetor2(vetor2, vetor2, vetor1);
        imprimeVetores(vetor, vetor1, vetor2);
        teclado.close();
    }

    private void lerVetores(int[] vetor, int[] vetor1, Scanner teclado) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i + 1) + " º termo");
            vetor[i] = teclado.nextInt();
        }
        for (int j = 0; j < vetor1.length; j++) {
            System.out.println("Informe o " + (j + 1) + " º termo");
            vetor1[j] = teclado.nextInt();
        }
    }

    private void completaVetor2(int[] vetor2, int[] vetor, int[] vetor1) {
        for (int k = 0; k < vetor2.length; k++) {
            vetor2[0] = vetor[0] + vetor1[0];
            vetor2[1] = vetor[1] + vetor1[1];
            vetor2[2] = vetor[2] + vetor1[2];
            vetor2[3] = vetor[3] + vetor1[3];
            vetor2[4] = vetor[4] + vetor1[4];
            vetor2[5] = vetor[5] + vetor1[5];
            vetor2[6] = vetor[6] + vetor1[6];
            vetor2[7] = vetor[7] + vetor1[7];
            vetor2[8] = vetor[8] + vetor1[8];
            vetor2[9] = vetor[9] + vetor1[9];
        }
    }

    private void imprimeVetores(int[] vetor, int[] vetor1, int[] vetor2) {
        System.out.println("------ IMPRIMINDO OS VETORES ------");
        System.out.println();
        System.out.println("------ VETOR 1 ------");
        for (int l = 0; l < vetor.length; l++) {
            System.out.println(vetor[l]);
        }
        System.out.println();
        System.out.println("------ VETOR 2 ------");
        for (int l = 0; l < vetor1.length; l++) {
            System.out.println(vetor1[l]);
        }
        System.out.println();
        System.out.println("------ VETOR 3 ------");
        for (int l = 0; l < vetor2.length; l++) {
            System.out.println(vetor2[l]);
        }
    }
}
