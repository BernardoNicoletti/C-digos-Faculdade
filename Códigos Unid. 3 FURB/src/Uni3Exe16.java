/* 
Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. Considerando que alguém está pagando uma compra, 
faça um programa que determine e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
Escreva também o número de cada tipo de nota a ser fornecido como troco. 
Suponha que o sistema monetário não utilize centavos.
*/

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notasDe100, notasDe10, notasDe1, notasInseridas, valorDaCompra, troco, novo;
        System.out.println("Informe o valor da compra: R$");
        valorDaCompra = teclado.nextInt();
        System.out.println("Quantos reais você usará para pagar?");
        notasInseridas = teclado.nextInt();
        troco = notasInseridas - valorDaCompra;
        novo = troco;
        notasDe100 = novo / 100;        
        novo = novo - notasDe100 * 100;             
        notasDe10 = novo / 10;           
        novo = novo - notasDe10 * 10;         
        notasDe1 = novo / 1;           
        novo = novo - notasDe1 * 1;
        System.out.println("O seu troco será de: R$ " + troco + ",00 reais");
        System.out.println("NOTAS DE TROCO: ");
        System.out.println(notasDe100 + " notas de R$ 100,00");
        System.out.println(notasDe10 + " notas de R$ 10,00");
        System.out.println(notasDe1 + " notas de R$ 1,00");
        teclado.close();
    }
}