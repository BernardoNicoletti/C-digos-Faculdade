import java.util.Scanner;
//RESOLVER

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dataVencimento, dataPagamento;
        double valorPrestacao, desconto, acrescimo, prestacaoFinal, diasAtrasado;
        System.out.println("Informe a data de vencimento da prestação: ");
        dataVencimento = teclado.nextInt();
        System.out.println("Informe a data em que você deseja pagar: ");
        dataPagamento = teclado.nextInt();
        System.out.println("Informe o valor da prestação: ");
        valorPrestacao = teclado.nextDouble();
        if (dataPagamento == dataVencimento || dataPagamento < dataVencimento) {
            desconto = valorPrestacao * 0.10;
            prestacaoFinal = valorPrestacao - desconto;
            System.out.println("Seu pagamento está em dia e você recebeu um desconto de 10%");
            System.out.println("O valor a ser pago é de: " + prestacaoFinal);
        } else if (dataPagamento > 10 && dataPagamento <= 15) {
            System.out.println("Você perdeu o desconto de 10%");
            System.out.println("O valor a ser pago é de: R$ " + valorPrestacao);
        } else if (dataPagamento >= 16) {
            diasAtrasado = 15 - dataPagamento;
            diasAtrasado = (diasAtrasado * 2) * (-1);
            acrescimo = valorPrestacao * 0.02;
            prestacaoFinal = valorPrestacao + (acrescimo * diasAtrasado);
            System.out.println("Seu pagamento foi atrasado em: " + diasAtrasado + " dias");
            System.out.println("O valor a ser pago é de: R$ " + prestacaoFinal);
        }
        teclado.close();
    }
}
