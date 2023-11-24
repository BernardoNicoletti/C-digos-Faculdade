import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        new Uni6Exe08();
    }

    public Uni6Exe08() {
        Scanner teclado = new Scanner(System.in);
        float vetor[] = criarELer(teclado);
        imprimirTabela(vetor);
        teclado.close();
    }

    private float[] criarELer(Scanner teclado) {
        int quantidade = 0;
        do {
            System.out.print("Digite a quantidade de " +
                    "posições para o vetor (<=20):");
            quantidade = teclado.nextInt();
        } while (quantidade <= 0 || quantidade > 20);
        float[] vetor = new float[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o valor[" + i + "]: ");
            vetor[i] = teclado.nextFloat();
        }
        return vetor;
    }

    private void imprimirTabela(float[] vetor) {

        float[] vetorUnico = new float[vetor.length];
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                vetorUnico[posicao] = vetor[i];
                posicao++;
            }
        }

        for (int i = 0; i < vetorUnico.length; i++) {
            System.out.print(vetorUnico[i] + " - ");
            int quantidade = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetorUnico[i] == vetor[j]) {
                    quantidade++;
                }
            }
            System.out.println(quantidade);
        }
    }
}