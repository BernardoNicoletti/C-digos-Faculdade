import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorMaximoPedagio = 0, valorDoPedagio = 0, distancia = 0;
        int trechoAcimaValor = 0, trechosInformados = 0, acimaDe150 = 0;
        System.out.println("Informe o valor máximo que deseja pagar em cada pedágio: ");
        valorMaximoPedagio = teclado.nextDouble();
        System.out.println("Informe o valor a pagar neste pedágio: ");
        valorDoPedagio = teclado.nextDouble();
        System.out.println("Informe a distância: ");
        distancia = teclado.nextDouble();
        while (valorDoPedagio > 0) {
            if (distancia > 150) {
                acimaDe150 += 1;
            }
            if (valorDoPedagio > valorMaximoPedagio) {
                trechoAcimaValor += 1;
            }
            if (distancia > 0) {
                trechosInformados += 1;
            }

            System.out.println("Informe o valor a pagar neste pedágio: ");
            valorDoPedagio = teclado.nextDouble();
            System.out.println("Informe a distância: ");
            distancia = teclado.nextDouble();
        }
        System.out.println("Trechos com valor acima do que o Astolfo se nega a pagar: " + trechoAcimaValor);
        System.out.println("Quantidade de trechos informados: " + trechosInformados);
        System.out.println("Trechos com a distância acima de 150KM: " + acimaDe150);
        teclado.close();
    }
}