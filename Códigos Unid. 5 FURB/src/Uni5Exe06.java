import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (double i = 1; i <= 20; i++) {
            System.out.println("Insira a altura das 20 pessoas: ");
            double altura = teclado.nextDouble();
            double media = altura / i;
            altura = 0;
            System.out.println("A média das pessoas é de: " + media);
        }
        teclado.close();
    }
}