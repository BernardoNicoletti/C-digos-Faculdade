import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int meses;
        meses = teclado.nextInt();
        if (meses <= 12) {
            System.out.println("O seu reajuste será de: 5%");
        } else if (meses == 13 || meses <= 48) {
            System.out.println("Seu reajuste será de: 7%");
        } else {
            System.out.println("Não recebeu reajuste salarial");
        }
        teclado.close();
    }
}