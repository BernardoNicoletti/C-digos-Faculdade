import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pcTotal = 0, pvTotal = 0;
        int lucro1 = 0, lucro2 = 0, lucro3 = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o preço de compra e o preço de venda da " + (i + 1) + "° mercadoria: ");
            double pc = teclado.nextDouble();
            double pv = teclado.nextDouble();
            double lucroPorcentagem = ((pv - pc) / pc) * 100;
            if (lucroPorcentagem < 10) {
                lucro1++;
            } else if (lucroPorcentagem >= 10 && lucroPorcentagem <= 20) {
                lucro2++;
            } else if (lucroPorcentagem > 20) {
                lucro3++;
            }
            pcTotal = pcTotal + pc;
            pvTotal = pvTotal + pv;
        }
        System.out.println("Quantidade de mercadorias que possuem menos de 10% de lucro: " + lucro1);
        System.out.println("Quantidade de mercadorias que possuem entre 10% e 20% de lucro: " + lucro2);
        System.out.println("Quantidade de mercadorias que possuem mais de 20% de lucro: " + lucro3);
        System.out.println("Preço de compra total: R$" + pcTotal);
        System.out.println("Preço de venda total: R$" + pvTotal);
        System.out.println("Lucro total: R$" + (pvTotal - pcTotal));
        teclado.close();
    }
}