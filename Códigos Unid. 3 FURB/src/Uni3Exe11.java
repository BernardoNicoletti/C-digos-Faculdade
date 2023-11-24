/*
Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32 
*/

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double grausC, grausF;
        System.out.println("Informe quantos °C você deseja converter: "); 
        grausC = teclado.nextDouble();
        grausF = (1.8 * grausC) + 32;
        System.out.println("Fazendo a conversão, o resultado é: " + grausF + "°F ");
        teclado.close();
    }

}
