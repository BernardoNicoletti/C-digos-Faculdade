import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        new Uni6Exe05();
    }

    public Uni6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String[] respostasMoca = new String[5];
        String[] respostasRapaz = new String[5];
        ler(respostasMoca, teclado);
        ler(respostasRapaz, teclado);
        int indice = calculaAfinidade(respostasMoca, respostasRapaz);
        if (indice == 15) {
            System.out.println("Casem!");
        } else if (indice >= 10 && indice <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (indice >= 5 && indice <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (indice >= 0 && indice <= 4) {
            System.out.println("Vale um encontro.");
        } else if (indice <= -1 && indice >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
        teclado.close();
    }

    private void ler(String[] vetor, Scanner teclado) {
        /*
         * System.out.print("Gosta de música sertaneja?");
         * vetor[0] = teclado.next();
         * System.out.print("Gosta de futebol?");
         * vetor[1] = teclado.next();
         * System.out.print("Gosta de seriados?");
         * vetor[2] = teclado.next();
         * System.out.print("Gosta de redes sociais?");
         * vetor[3] = teclado.next();
         * System.out.println("Gosta da Oktoberfest?");
         * vetor[4] = teclado.next();
         */
        // OUTRA OPÇÃO:
        String[] perguntas = { "Gosta de música sertaneja?",
                "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?", "Gosta da Oktoberfest?" };
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i]);
            vetor[i] = teclado.next();
        }
    }

    private int calculaAfinidade(String[] respostaRapaz, String[] respostaMoca) {
        int indiceAfinidade = 0;
        for (int posicao = 0; posicao < respostaMoca.length; posicao++) {
            if (respostaRapaz[posicao].equalsIgnoreCase(
                    respostaMoca[posicao])) {
                indiceAfinidade += 3;
            } else if (respostaMoca[posicao].equalsIgnoreCase("IND")
                    ||
                    respostaRapaz[posicao].equalsIgnoreCase("IND")) {
                indiceAfinidade += 1;
            } else {
                indiceAfinidade -= 2;
            }
        }
        return indiceAfinidade;
    }
}