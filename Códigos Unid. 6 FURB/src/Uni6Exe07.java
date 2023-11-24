import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        new Uni6Exe07();
    }

    public Uni6Exe07() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor para o seu vetor: ");
        int N = teclado.nextInt();
        int[] vetor = new int[N];
        int i = 0;
        int bolha = 0;
        insereValores(vetor, teclado, i);
        ordenaVetor(vetor, bolha, i);
        imprimeVetor(vetor);
        teclado.close();
    }

    private void insereValores(int[] vetor, Scanner teclado, int i) {
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
            }
        }

    private void ordenaVetor(int[] vetor, int bolha, int i) {
        while (i < vetor.length - 1) {
            if (vetor[i] > vetor[i + 1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;
            } else {
                i = i + 1;
            }
        }
    }

    /*
     * int posiçãoAtual = 0;
     * int numeroNovo;
     * while (posiçãoAtual < numeros.length - 1) {
     * if (numeros[posiçãoAtual] > numeros[posiçãoAtual + 1]) {
     * numeroNovo = numeros[posiçãoAtual];
     * numeros[posiçãoAtual] = numeros[posiçãoAtual + 1];
     * numeros[posiçãoAtual + 1] = numeroNovo;
     * posiçãoAtual = 0;
     * } else {
     * posiçãoAtual++;
     * }
     * }
     */
    private void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}