import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2;
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();

        if (valor1 % 3 == 0 && valor2 % 3 == 0) {
            System.out.println("Os números informados são múltiplos de 3.");
        } else {
            System.out.println("Os números informados não são múltiplos de 3.");
        }
        teclado.close();
    }
}