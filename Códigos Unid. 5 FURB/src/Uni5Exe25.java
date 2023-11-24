import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoD = 0, ladoE = 0, diferenca = 0, diferenca1 = 0;
        System.out.println("Informe a quantidade de pontos do jogador da DIREITA: ");
        ladoD = teclado.nextInt();
        System.out.println("Informe a quantidade de pontos do jogador da ESQUERDA: ");
        ladoE = teclado.nextInt();
        while (ladoD >= 21 || ladoE >=21) {
            diferenca = ladoE -ladoD;
            diferenca1 = ladoD - ladoE;
            if (ladoE >= 21 && diferenca >= 2) {
                System.out.println("O jogador do lado ESQUERDO ganhou!");
                break;
            } else if (ladoD >= 21 && diferenca1 >= 2) {
                System.out.println("O jogador do lado DIREITO ganhou: ");
                break;
            }
        }
        teclado.close();
    }
}