/*
Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina 
e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
*/

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gasolina;
        double valorPago;
        double gasolinaTotal;

        System.out.println("Informe o preço do litro da gasolina: ");
        gasolina = teclado.nextDouble();
        System.out.println("Quantos reais você deseja colocar?");
        valorPago = teclado.nextDouble();

        gasolinaTotal = valorPago / gasolina;

        System.out.println("O preço informado da gasolina é de: R$" + gasolina + " o litro.");
        System.out.println("O valor depositado para a gasolina foi de: R$" + valorPago);
        System.out.println("Você conseguiu abastecer somente: " + gasolinaTotal + " litros de gasolina.");

        teclado.close();
    }
}
