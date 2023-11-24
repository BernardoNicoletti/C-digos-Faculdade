/*
Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e 
garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, 
faça um programa para calcular quantos litros de refrigerante ele comprou. 
*/

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double produto1, produto2, produto3, total;

        System.out.println("Informe quantos refrigerante de 350ml você adquiriu: ");
        produto1 = teclado.nextDouble(); 
        System.out.println("Informe quantos refrigerantes de 500ml você adquiriu: ");
        produto2 = teclado.nextDouble();
        System.out.println("Informe quantos refrigerantes de 2L você adquiriu: ");
        produto3 = teclado.nextDouble();

        produto1 = produto1 * 350;
        produto2 = produto2 * 500; 
        produto3 = produto3 * 2000; 
        total = (produto1 + produto2 + produto3) / 1000; 

        System.out.println("PARABÉNS, você adquiriu : " + total + "litros de refrigerante.");
        teclado.close();
    }
}
