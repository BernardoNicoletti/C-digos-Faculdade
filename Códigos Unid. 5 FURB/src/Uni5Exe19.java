import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorCompra = 0, valorDesconto = 0, valorFinal = 0, valorLoja = 0;
        System.out.println("Informe o valor da compra: ");
        valorCompra = teclado.nextDouble();
        while (valorCompra > 0) {
            if (valorCompra > 500) {
                valorDesconto = valorCompra * 0.20;
                valorFinal = valorCompra - valorDesconto;
                valorLoja += valorFinal;
                System.out.println("O valor final de sua compra foi de: R$" + valorFinal);
            } else if (valorCompra <= 500) {
                valorDesconto = valorCompra * 0.15;
                valorFinal = valorCompra - valorDesconto;
                valorLoja += valorFinal;
                System.out.println("O valor final de sua compra foi de: R$" + valorFinal);
            }
            System.out.println("Informe o valor de outra compra: ");
            valorCompra = teclado.nextDouble();
        }
        System.out.println("O valor recebido pela loja ao final do dia foi de: R$" + valorLoja);
        teclado.close();
    }
}