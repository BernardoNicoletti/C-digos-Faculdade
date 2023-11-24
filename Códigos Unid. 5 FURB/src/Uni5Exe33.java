import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoCandidato = 0, votosAmaral = 0, votosJoaquim = 0, votosClaudia = 0, votosVanessa = 0;
        double somaNuloBranco = 0, votoNulo = 0, votoBranco = 0, votosTotais = 0;
        do {
            System.out.println("------ VOTAÇÃO ------");
            System.out.println("[1] Amaral");
            System.out.println("[2] Joaquim");
            System.out.println("[3] Claudia");
            System.out.println("[4] Vanessa");
            System.out.println("[5] Voto nulo");
            System.out.println("[6] Voto em branco");
            System.out.println("[0] Para encerrar a votação");
            codigoCandidato = teclado.nextInt();
            if (codigoCandidato < 0 || codigoCandidato > 6) {
                System.out.println("Opção incorreta");
            } else if (codigoCandidato == 0) {
                break;
            }
            switch (codigoCandidato) {
                case 1:
                    votosAmaral += 1;
                    break;
                case 2:
                    votosJoaquim += 1;
                    break;
                case 3:
                    votosClaudia += 1;
                    break;
                case 4:
                    votosVanessa += 1;
                    break;
                case 5:
                    votoNulo += 1;
                    break;
                case 6:
                    votoBranco += 1;
                    break;
            }
            codigoCandidato = 0;
            votosTotais += 1;
        } while (votosTotais <= 9);
        somaNuloBranco = ((votoNulo + votoBranco ) / votosTotais) * 100;
        System.out.println("------ TOTAL DE VOTOS PARA CADA CANDIDATO ------");
        System.out.println("Total de votos para o candidato Amaral: " + votosAmaral + " voto(s)");
        System.out.println("Total de votos para o candidato Joaquim: " + votosJoaquim + " voto(s)");
        System.out.println("Total de votos para a candidata Claudia: " + votosClaudia + " voto(s)");
        System.out.println("Total de votos para a candidata Vanessa: " + votosVanessa + " voto(s)");
        System.out.println();
        System.out.println("------ TOTAL DE VOTO(S) NULO(S) ------");
        System.out.println("Total de voto(s) NULO(S): " + votoNulo);
        System.out.println();
        System.out.println("------ TOTAL DE VOTOS EM BRANCO ------");
        System.out.println("Total de voto(s) em BRANCO: " + votoBranco);
        System.out.println();
        System.out.println("------ PERCENTUAL DOS VOTOS EM BRANCO E NULO SOBRE O TOTAL ------");
        System.out.println("Percentual de votos EM BRANCO e NULO sobre o TOTAL: " + somaNuloBranco + "%");
        System.out.println();
        System.out.println("------ TOTAL DE VOTOS ------");
        System.out.println("Total de votos: " + votosTotais);
        teclado.close();
    }
}