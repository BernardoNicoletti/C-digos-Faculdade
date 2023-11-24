import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorDigitado;
        valorDigitado = teclado.nextInt();
        if(valorDigitado%2 == 0) {
            System.out.println("Número é par");
        }else {
            System.out.println("Número é ímpar");
        }
        teclado.close();
    }
}
