import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = teclado.nextInt();
        int divisor = 2;
        System.out.println("Número/Decomposição");
        while (n != 1) {
            while (n % divisor == 0) {
                System.out.println(n + " " + divisor);
                n = n / divisor;
            }
            divisor++;
        }
        System.out.println(n);
        teclado.close();
    }
}