/*
Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
Volume = PI * raio^2 * altura
*/


import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        double altura, raio, pi, volumeTotal; 

        System.out.println("Informe a altura da lata: ");
        altura = teclado.nextDouble();
        System.out.println("Informe o raio da lata: ");
        raio = teclado.nextDouble();
        System.out.println("Informe o PI da lata: ");
        pi = teclado.nextDouble();
        volumeTotal = pi * (raio * raio) * altura;
        System.out.println("O volume da sua lata de óleo é de: " + volumeTotal + "m^3");
        teclado.close(); 
    }
}
