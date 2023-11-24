import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double salario, imposto, dependentes, salarioComImposto, impostoDependentes;
        System.out.println("Informe o seu salário por gentileza: ");
        salario = teclado.nextDouble();
        System.out.println("Informe se existem dependentes que moram com você e quantos: ");
        dependentes = teclado.nextDouble();
        if (salario <= 2000 && dependentes == 0) {
            System.out.println("Não paga imposto");
            System.out.println("Não tem desconto por dependentes");
            System.out.println("Seu salário continuará sendo: R$ " + df_2.format(salario));
        } else if (salario >= 2000.1 && salario <= 5000 && dependentes == 0) {
            imposto = salario * 0.05;
            salarioComImposto = salario - imposto;
            System.out.println("Você pagará um imposto de 5%");
            System.out.println("Não tem desconto por dependentes");
            System.out.println("Seu salário será de: R$ " + df_2.format(salarioComImposto));
        } else if (salario >= 2000.1 && salario <= 5000 && dependentes >= 1) {
            imposto = salario * 0.05;
            impostoDependentes = salario * (dependentes * 0.02);
            salarioComImposto = salario - imposto - impostoDependentes;
            System.out.println("Você pagará um imposto de: 5%");
            System.out.println("Você possui um ou mais dependentes e isso acarreta em deconto");
            System.out.println("Seu salário será de: R$ " + df_2.format(salarioComImposto));
        } else if (salario >= 5001 && salario <= 10000 && dependentes == 0) {
            imposto = salario * 0.10;
            salarioComImposto = salario - imposto;
            System.out.println("Você pagará um imposto de: 10%");
            System.out.println("Não tem desconto por dependentes");
            System.out.println("Seu salário será de: R$ " + df_2.format(salarioComImposto));
        } else if (salario >= 5001 && salario <= 10000 && dependentes >= 1) {
            imposto = salario * 0.10;
            impostoDependentes = salario * (dependentes * 0.02);
            salarioComImposto = salario - imposto - impostoDependentes;
            System.out.println("Você pagará um imposto de: 10%");
            System.out.println("Você possui um ou mais dependentes e isso acarreta em desconto");
            System.out.println("Seu salário será de: R$ " + df_2.format(salarioComImposto));
        } else if (salario > 10001 && dependentes == 0) {
            imposto = salario * 0.15;
            salarioComImposto = salario - imposto;
            System.out.println("Você pagará um imposto de: 15%");
            System.out.println("Não tem desconto por dependentes");
            System.out.println("Seu salário será de: R$ " + df_2.format(salarioComImposto));
        } else if (salario > 10001 && dependentes >= 1) {
            imposto = salario * 0.15;
            impostoDependentes = salario * (dependentes * 0.02);
            salarioComImposto = salario - imposto - impostoDependentes;
            System.out.println("Você pagará um imposto de: 15%");
            System.out.println("Você possui um ou mais dependentes e isso acarreta em desconto");
            System.out.println("Seu salário será de: R$ " + df_2.format(salarioComImposto));
        }
        teclado.close();
    }
}