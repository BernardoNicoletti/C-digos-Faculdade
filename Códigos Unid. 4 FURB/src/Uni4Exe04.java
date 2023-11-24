import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numeroDigitado;
        numeroDigitado = teclado.nextDouble();
        if (numeroDigitado % 2 == 0) {
            System.out.println("O valor não possui casas decimais.");
        } else {
            System.out.println("O valor possui casas decimais.");
        }
        teclado.close();
    }
}