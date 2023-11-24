/*
Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o 
comprimento e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. 
Considere que um metro quadrado é formado por 9 azulejos. 
*/

import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double azulejoEstampado = 12.50; 
        double largura, comprimento, areaTotal;

        System.out.println("Informe qual é a largura total da parede: ");
        largura = teclado.nextDouble();
        System.out.println("Informe qual o comprimento total da parede: ");
        comprimento = teclado.nextDouble();

        areaTotal = largura * comprimento;
        areaTotal = areaTotal * 9 * azulejoEstampado;
        System.out.println("O valor total para preencher a sua parede com azulejos é de: R$" + areaTotal +"reais.");
        teclado.close();
    }
}