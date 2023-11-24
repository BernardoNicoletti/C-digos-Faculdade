import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas latas de 350ml foram compradas?");
        int latas350 = teclado.nextInt();
        System.out.println("Quantas garrafas de 600ml foram compradas?");
        int garrafas600 = teclado.nextInt();
        System.out.println("Quantas garrafas de 2L foram compradsa?");
        int garrafas2L = teclado.nextInt();
        double l3 = latas350;
        double g6 = garrafas600;
        double g2 = garrafas2L;
        double litros = (l3 * 0.35) + (g6 * 0.6) + (g2 * 2);
        System.out.println("Quantide total de litros: " + litros + "L");
        teclado.close();
    }
}