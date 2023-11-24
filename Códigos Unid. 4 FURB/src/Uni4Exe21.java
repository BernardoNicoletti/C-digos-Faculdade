import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double IMC, massa, altura;
        System.out.println("Informe quantos quilogrmas você pesa: ");
        massa = teclado.nextDouble();
        System.out.println("Informe a sua altura, em metros: ");
        altura = teclado.nextDouble();
        IMC = massa / (altura * altura);
        if (IMC <= 18.5) {
            System.out.println("O seu IMC é de: " + df_2.format(IMC) + " | Classificação: MAGREZA");
        } else if (IMC > 18.5 && IMC <= 24.9) {
            System.out.println("O seu IMC é de: " + df_2.format(IMC) + " | Classificação: SAUDÁVEl");
        } else if (IMC > 25.0 && IMC <= 29.9) {
            System.out.println("O seu IMC é de: " + df_2.format(IMC) + " | Classificação: SOBREPESO");
        } else if (IMC > 30.0 && IMC <= 34.9) {
            System.out.println("O seu IMC é de: " + df_2.format(IMC) + " | Classificação: OBESIDADE GRAU I");
        } else if (IMC > 35.0 && IMC <= 39.9) {
            System.out.println("O seu IMC é de: " + df_2.format(IMC) + " | Classificação: OBESIDADE GRAU II (Severa)");
        } else if (IMC >= 40.0) {
            System.out.println("O seu IMC é de: " + df_2.format(IMC) + " | Classificação: OBESIDADE GRAU III (Mórbida)");
        }
        teclado.close();
    }
}