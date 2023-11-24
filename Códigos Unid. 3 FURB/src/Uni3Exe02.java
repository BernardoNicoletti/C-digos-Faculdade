
/*
Valores de teste:
Valor sapato: 100,00 
Valor do Deconto: 12,00
Sapato com desconto: 88,00
Valor sapato: 150,00 
Valor do Deconto: 18,00
Sapato com desconto: 132,00
*/
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        double precoParSapatos;
        System.out.println("Informe o preço do par do sapato: ");
        precoParSapatos = teclado.nextDouble();

        // Processo
        double valorDesconto = precoParSapatos * 0.12; // 0.12 igual 12%
        double precoParSapatosDesconto = precoParSapatos - valorDesconto;

        // Saída
        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + precoParSapatosDesconto);

        teclado.close();
    }
}
