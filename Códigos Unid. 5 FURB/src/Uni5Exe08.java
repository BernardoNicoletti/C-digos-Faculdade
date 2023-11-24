import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numerosPositivos = 0, numero = 0, mediaPositivos = 0, entrouNoPositivo = 0, menorNegativo = 0;
        int n = 0;
        System.out.println("Informe quantos números você deseja analisar: ");
        n = teclado.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Infomre o número: ");
            numero = teclado.nextDouble();
            if (numero >= 0) {
                entrouNoPositivo += 1;
                numerosPositivos += numero;
                mediaPositivos = numerosPositivos / entrouNoPositivo;
            }
            if (numero < 0) {
                menorNegativo = numero;
            }
        }
        System.out.println("O menor valor negativo é: " + menorNegativo);
        System.out.println("A média dos números positivos é de: " + mediaPositivos);
        teclado.close();
    }
}
