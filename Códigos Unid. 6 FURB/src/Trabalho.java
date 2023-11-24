import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        new Trabalho();
    }

    public Trabalho() {
        Scanner teclado = new Scanner(System.in);
        String posicao[][] = new String[6][7];
        boolean condicao = false;
        String jogador = "";
        String maquinaJogador = " ";
        String condicao2 = " ";
        boolean controle = false;
        ReiniciarJogo(posicao);
        condicao2 = TrocarJogador(teclado, jogador, maquinaJogador, condicao2);
        if (condicao2 == "A") {
            jogador = "A";
            maquinaJogador = "V";
        }
        if (condicao2 == "V") {
            jogador = "V";
            maquinaJogador = "A";
        }
        controle = opcao(teclado);
        do {
            if (controle == true) {
                imprimir(posicao);
            } else {
                boolean condicao3 = imprimirNovamente(teclado);
                if (condicao3 == true) {
                    imprimir(posicao);
                }
            }
            condicao = adicionar(teclado, posicao, jogador, maquinaJogador);
        } while (condicao != true);
        teclado.close();
    }

    private boolean adicionar(Scanner teclado, String posicao[][], String jogador, String maquinaJogador) {
        boolean controle = false;
        boolean condicao2 = false;
        do {
            System.out.println("Digite a coluna que deseja selecionar: ");
            int coluna = teclado.nextInt();
            coluna--;
            if (posicao[0][coluna] != "B") {
                controle = false;
                System.out.println("Coluna inválida ou cheia. Tente novamente.");
            } else {

                for (int i = 5; i >= 0; i--) {
                    if (posicao[i][coluna] == "B") {
                        posicao[i][coluna] = jogador;
                        controle = true;
                        break;
                    }
                }
            }
        } while (controle != true);
        if (verificarVitoriaHorizontal(jogador, posicao, maquinaJogador) == true ||
                verificarVitoriaVertical(jogador, posicao, maquinaJogador) == true ||
                verificarVitoriaDiagonalDireita(jogador, posicao, maquinaJogador) == true ||
                verificarVitoriaDiagonalEsquerda(jogador, posicao, maquinaJogador) == true) {
            condicao2 = true;
        } else if (verificarEmpate(posicao) == true) {
            condicao2 = true;
            System.out.println("EMPATE!");
        }
        if (controle == true && condicao2 == false) {
            int local;
            do {
                local = (int) ((Math.random() * 7) - 0);
            } while (posicao[0][local] != "B");

            for (int i = 5; i >= 0; i--) {
                if (posicao[i][local] == "B") {
                    posicao[i][local] = maquinaJogador;
                    break;
                }
            }
            System.out.println("O computador jogou na coluna " + (local + 1) + ".");
        }
        return condicao2;

    }

    private void ReiniciarJogo(String posicao[][]) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                posicao[i][j] = "B";
            }
        }
    }

    private void imprimir(String posicao[][]) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(posicao[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private String TrocarJogador(Scanner teclado, String jogador, String maquinaJogador, String condicao2) {
        System.out.println("Digite a sua cor: A(Azul) ou V(vermelho)");
        String opcao = teclado.next();
        if (opcao.equalsIgnoreCase("A")) {
            condicao2 = "A";
        } else if (opcao.equalsIgnoreCase("V")) {
            condicao2 = "V";
        }
        return condicao2;
    }

    private boolean verificarVitoriaHorizontal(String jogador, String posicao[][], String maquinaJogador) {
        boolean condicao = false;
        boolean vencedor1 = false;
        boolean vencedor2 = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (posicao[i][j] == jogador &&
                        posicao[i][j + 1] == jogador &&
                        posicao[i][j + 2] == jogador &&
                        posicao[i][j + 3] == jogador) {
                    condicao = true;
                    vencedor1 = true;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (posicao[i][j] == maquinaJogador &&
                        posicao[i][j + 1] == maquinaJogador &&
                        posicao[i][j + 2] == maquinaJogador &&
                        posicao[i][j + 3] == maquinaJogador) {
                    condicao = true;
                    vencedor2 = true;
                }
            }
        }
        if (condicao == true && vencedor1 == true) {
            System.out.println("Parábens, Você ganhou!");
        }
        if (condicao == true && vencedor2 == true) {
            System.out.println("Derrota, A maquina ganhou!");
        }
        return condicao;
    }

    private boolean verificarVitoriaVertical(String jogador, String posicao[][], String maquinaJogador) {
        boolean condicao = false;
        boolean vencedor1 = false;
        boolean vencedor2 = false;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 7; i++) {
                if (posicao[j][i] == jogador &&
                        posicao[j + 1][i] == jogador &&
                        posicao[j + 2][i] == jogador &&
                        posicao[j + 3][i] == jogador) {
                    condicao = true;
                    vencedor1 = true;
                }
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 7; i++) {
                if (posicao[j][i] == maquinaJogador &&
                        posicao[j + 1][i] == maquinaJogador &&
                        posicao[j + 2][i] == maquinaJogador &&
                        posicao[j + 3][i] == maquinaJogador) {
                    condicao = true;
                    vencedor2 = true;
                }
            }
        }
        if (condicao == true && vencedor1 == true) {
            System.out.println("Parábens, Você ganhou!");
        }
        if (condicao == true && vencedor2 == true) {
            System.out.println("Derrota, A maquina ganhou!");
        }
        return condicao;
    }

    private boolean verificarVitoriaDiagonalDireita(String jogador, String posicao[][], String maquinaJogador) {
        boolean condicao = false;
        boolean vencedor1 = false;
        boolean vencedor2 = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (posicao[i][j] == jogador &&
                        posicao[i + 1][j + 1] == jogador &&
                        posicao[i + 2][j + 2] == jogador &&
                        posicao[i + 3][j + 3] == jogador) {
                    condicao = true;
                    vencedor1 = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (posicao[i][j] == maquinaJogador &&
                        posicao[i + 1][j + 1] == maquinaJogador &&
                        posicao[i + 2][j + 2] == maquinaJogador &&
                        posicao[i + 3][j + 3] == maquinaJogador) {
                    condicao = true;
                    vencedor2 = true;
                }
            }
            if (condicao == true && vencedor1 == true) {
                System.out.println("Parábens, Você ganhou!");
            }
            if (condicao == true && vencedor2 == true) {
                System.out.println("Derrota, A maquina ganhou!");
            }
        }
        return condicao;
    }

    private boolean verificarVitoriaDiagonalEsquerda(String jogador, String posicao[][], String maquinaJogador) {
        boolean condicao = false;
        boolean vencedor1 = false;
        boolean vencedor2 = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (posicao[i][j] == jogador &&
                        posicao[i + 1][j - 1] == jogador &&
                        posicao[i + 2][j - 2] == jogador &&
                        posicao[i + 3][j - 3] == jogador) {
                    condicao = true;
                    vencedor1 = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (posicao[i][j] == maquinaJogador &&
                        posicao[i + 1][j - 1] == maquinaJogador &&
                        posicao[i + 2][j - 2] == maquinaJogador &&
                        posicao[i + 3][j - 3] == maquinaJogador) {
                    condicao = true;
                    vencedor2 = true;
                }
            }
        }
        if (condicao == true && vencedor1 == true) {
            System.out.println("Parábens, Você ganhou!");
        }
        if (condicao == true && vencedor2 == true) {
            System.out.println("Derrota, A maquina ganhou!");
        }
        return condicao;
    }

    private boolean verificarEmpate(String posicao[][]) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (posicao[i][j] == "B") {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean imprimirNovamente(Scanner teclado) {
        boolean condicao = false;
        System.out.println("Você deseja imprimir a tabela?(s-Sim) ou (n-Não)");
        String opcao = teclado.next();
        if (opcao.equalsIgnoreCase("s")) {
            condicao = true;
        } else {
            condicao = false;
        }
        return condicao;
    }

    private boolean opcao(Scanner teclado) {
        boolean condicao = false;
        System.out.println("Você deseja imprimir a tabela toda rodada?(s-Sim) ou (n-N\u00E3o)");
        String opcao = teclado.next();
        if (opcao.equalsIgnoreCase("s")) {
            condicao = true;
        } else {
            condicao = false;
        }
        return condicao;
    }

}