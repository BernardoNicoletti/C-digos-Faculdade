/* 
Faça um programa para ler três notas de um aluno em uma disciplina 
e imprimira sua média ponderada 
(as notas tem pesos respectivos de 5, 3 e 2).
*/

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double nota1, nota2, nota3, media;

       System.out.println("Infomre a sua primeira nota: ");
       nota1 = teclado.nextDouble(); 
       System.out.println("Informe a sua segunda nota: ");
       nota2 = teclado.nextDouble();
       System.out.println("Informe a sua terceira nota: ");
       nota3 = teclado.nextDouble();

       media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 3;
       
       System.out.println("A sua média foi de: " + media);
       teclado.close(); 
    }
}