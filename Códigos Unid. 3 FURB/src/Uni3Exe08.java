/*
Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares 
para o atendente. Considerando que o atendente tem a cotação do dólar, 
descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa. 
*/

import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double cotacao = 5.5;
        double dolar; 
        double totalConvertido; 

        System.out.println("Quantos dólares você deseja converter para reais? ");
        dolar = teclado.nextDouble(); 

        totalConvertido = dolar * cotacao; 

        System.out.println("A quantia convertida, lhe rendeu: R$" + totalConvertido);
        teclado.close();
    }
}
