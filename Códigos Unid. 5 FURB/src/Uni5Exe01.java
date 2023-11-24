import java.util.Scanner;

public class Uni5Exe01 {
    //Descreva um algoritmo que leia 20 números inteiros e escreva,
    //para cada número lido, se o mesmo é par ou ímpar.
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        for (int qnt = 0; qnt < 20; qnt++) {
            System.out.print("Digite um número: ");
            int numero = s.nextInt();

            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("ÍMPAR");
            }
        }
        s.close();
    }
}