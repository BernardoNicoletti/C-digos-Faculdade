import java.util.Scanner;

public class Questao01_prova {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String Cor = "";
        Cor = teclado.nextLine();
        int numeroRGB, novaCor;
        if (Cor.isEmpty() == true) {
            System.out.println("Valor inválido");
        } else if (Cor.isEmpty() == false) {
            numeroRGB = teclado.nextInt();
            if (numeroRGB <= 255) {
                System.out.println("Valor inválido");
            } else if (numeroRGB > 255) {
                novaCor = numeroRGB + 20;
                System.out.println("Cor: " + Cor + " Nova cor: " + novaCor);
            }
        }
        teclado.close();
    }
}