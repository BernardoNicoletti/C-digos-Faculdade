import java.util.Scanner;

public class Uni5Exe02 {
    /*
     * Descreva um algoritmo que calcule e escreva a soma dos 
     * números pares e a soma
     * dos números ímpares entre 1 e 100.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                pares += numero; //pares = pares + numero;
            } else {
                impares += numero;
            }
        }
        System.out.println("Soma pares: " + pares + "\nSoma ímpares: " + impares);
        s.close();
    }
}