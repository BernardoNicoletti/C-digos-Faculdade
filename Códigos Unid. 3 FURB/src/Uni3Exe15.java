/* 
Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:

3 centena(s)  8 dezena(s) 4 unidade(s)  
*/


import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado; 
        int dezena, centena, unidade, novo;
        numeroDigitado = teclado.nextInt();
        novo = numeroDigitado;
        centena = novo / 100;         
        novo = novo - centena * 100;  
        dezena = novo / 10;           
        novo = novo - dezena * 10;          
        unidade = novo / 1;            
        novo = novo - unidade * 1;
        teclado.close();
        System.out.print(centena + " centena(s)  ");
        System.out.print(dezena + " dezena(s)  ");
        System.out.print(unidade + " unidade(s)  ");
    } 
}