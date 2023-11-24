import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double produtosVendidos = 0, valorDoProduto = 0, salarioFinal = 0, bonus30 = 0, bonusTotal = 0, i = 0,
                salarioFixo = 0, totalVendas = 0;
        String resposta, nome;
        System.out.println("Deseja digitar os dados de mais um vendedor: S(SIM ou N(NÂO)");
        resposta = teclado.next();
        while (!resposta.trim().equalsIgnoreCase("N")) {
            System.out.println("Informe quantos produtos você vendeu neste mês: ");
            produtosVendidos = teclado.nextDouble();
            System.out.println("Informe o seu salário fixo: ");
            salarioFixo = teclado.nextDouble();
            while (produtosVendidos != i) {
                System.out.println("Informe o valor de cada produto: ");
                valorDoProduto = teclado.nextDouble();
                totalVendas += valorDoProduto;
                bonus30 = valorDoProduto * 0.30;
                bonusTotal += bonus30;
                i++;
            }
            salarioFinal = bonusTotal + salarioFixo;
            System.out.println("Deseja digitar os dados de mais um vendedor: S(SIM ou N(NÂO)");
            resposta = teclado.next();
        }
        System.out.println("Informe o seu nome: ");
        nome = teclado.next();
        System.out.println();
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Total de vendas: R$" + totalVendas);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário com bônus de vendas: R$ " + salarioFinal);
        teclado.close();
    }
}