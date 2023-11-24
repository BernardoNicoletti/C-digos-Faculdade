import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaMes = 0;
        double peca80 = 0.80, peca50 = 0.50, peca40 = 0.40, peca30 = 0.30, pecaManha = 0, pecaTarde = 0,
                valorDiario = 0, somaPecas = 0, valorManha = 0, valorTarde = 0;
        String resposta;
        System.out.println("Novo funcionário: ");
        System.out.println("[1] Sim");
        System.out.println("[2] Não");
        resposta = teclado.next();
        while (!resposta.trim().equalsIgnoreCase("Nao")) {
            System.out.println("Informe o dia do mês: ");
            diaMes = teclado.nextInt();
            if (diaMes >= 1 && diaMes <= 15) {
                System.out.println("Informe quantas peças foram produzidas no seu turno da MANHÂ: ");
                pecaManha = teclado.nextDouble();
                System.out.println("Informe quantas peças foram produzidas no seu turno da TARDE: ");
                pecaTarde = teclado.nextDouble();
                somaPecas = pecaManha + pecaTarde;
                if (pecaManha >= 30 && pecaTarde >= 30 && somaPecas >= 100) {
                    valorDiario = somaPecas * peca80;
                } else if (pecaManha < 30 || pecaTarde < 30 || somaPecas < 100) {
                    valorDiario = somaPecas * peca50;
                }
                System.out.println("Dia: " + diaMes);
                System.out.println("Manhã: " + pecaManha);
                System.out.println("Tarde: " + pecaTarde);
                System.out.println("Saída: R$" + valorDiario + " (valor recebido)");
            } else if (diaMes >= 16 && diaMes <= 30) {
                System.out.println("Informe quantas peças foram produzidas no seu turno da MANHÂ: ");
                pecaManha = teclado.nextDouble();
                System.out.println("Informe quantas peças foram produzidas no seu turno da TARDE: ");
                pecaTarde = teclado.nextDouble();
                valorManha = pecaManha * peca40;
                valorTarde = pecaTarde * peca30;
                valorDiario = valorManha + valorTarde;
                System.out.println("Dia: " + diaMes);
                System.out.println("Manhã: " + pecaManha);
                System.out.println("Tarde: " + pecaTarde);
                System.out.println("Saída: R$" + valorDiario + " (valor recebido)");
            } else {
                System.out.println("Dia: " + diaMes);
                System.out.println("Manhã: --");
                System.out.println("Tarde: --");
                System.out.println("Saída: Dia inválido");
            }
            resposta = teclado.next();
        }
        teclado.close();
    }
}