/*
Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato 
montado pelo cliente (em quilos) 
e imprima o valor a pagar. O peso do prato é de 750 gramas.
*/

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoPorKilo = 25; 
        double pesoPrato; 
        double precoParaPagar; 

        System.out.println("Informe quantos gramas tem o seu prato: ");
        pesoPrato = teclado.nextDouble();
        
        pesoPrato = pesoPrato / 1000;
        precoParaPagar = precoPorKilo * pesoPrato; 

        System.out.println("O valor a ser pago é de: R$" + precoParaPagar);
        teclado.close();
    }
}