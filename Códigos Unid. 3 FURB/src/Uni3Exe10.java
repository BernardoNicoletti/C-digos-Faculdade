/*
Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
Fórmula: 
*/


import java.util.Scanner; 

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double catOposto, catAdjacente, hipotenusa; 

        System.out.println("Infomre o valor do cateto oposto: ");
        catOposto = teclado.nextDouble(); 
        System.out.println("Informe o valor do cateto adjacente: ");
        catAdjacente = teclado.nextDouble();

        hipotenusa = (catOposto * catOposto) + (catAdjacente * catAdjacente); 
        System.out.println("O valor da hipotenusa é de: " + hipotenusa);
        teclado.close(); 
    }
}
