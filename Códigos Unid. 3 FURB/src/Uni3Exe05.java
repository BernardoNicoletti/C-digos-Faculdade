/* 
Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois 
anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa 
R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa 
para calcular o gasto total da granja para marcar todos os seus frangos.
*/

import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double chip1, calculoChip1, totalGasto;
        double chip2, calculoChip2; 

        System.out.println("Informe quantos frangos existem em sua granja: ");
        chip1 = teclado.nextDouble();
        chip2 = teclado.nextDouble();

        calculoChip1 = chip1 * 4;
        calculoChip2 = (chip2 * 2) * 3.50; 
        totalGasto = calculoChip1 + calculoChip2; 

        System.out.println("O total gasto pela granja para marcar todos os seus frangos foi de: R$" + totalGasto);
        teclado.close();
    }
}
