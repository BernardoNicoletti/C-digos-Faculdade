/*
terrenos retangulares.  e depois .
Gordura ____
Uma imobiliária vende apenas 
Faça um programa para 
Entrada __
ler as dimensões de um terreno
Processo __
Saída __
exibir a área do terreno
*/

import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variáveis
        double largura;
        double altura;
        double area;

        // Entrada
        System.out.println("Entre c/ largura: ");
        largura = teclado.nextDouble();
        System.out.println("Entre c/ altura: ");
        altura = teclado.nextDouble();

        // Processo
        area = largura * altura;
        System.out.println("Área: " + area);

        // Saída
        System.out.println(area);

        teclado.close();
    }
}
