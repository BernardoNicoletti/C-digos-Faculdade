import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        System.out.println("Informe a quantidade de ");
        n = teclado.nextInt();
        System.out.println();
        int i, j, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println(k + "  ");
                k++;
            }
            System.out.println();
            teclado.close();
        }
    }
}