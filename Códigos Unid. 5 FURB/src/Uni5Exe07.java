import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        int n = 0;
        n = teclado.nextInt();
        System.out.println("Informe o primeiro número: ");
        numero = teclado.nextDouble();
        double maior = numero;
        double menor = numero;
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o " + (i + 1) + " o número");
            numero = teclado.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        teclado.close();
    }
}