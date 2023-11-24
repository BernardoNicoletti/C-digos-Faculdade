import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2;
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
        if(valor1 > valor2) {
            System.out.println("Valor 1 é maior que o valor 2.");
        }else {
            System.out.println("Valor 2 é maior que o valor 1.");
        }
        teclado.close();
    }
}
