import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double X, Y;
        X = teclado.nextDouble();
        Y = teclado.nextDouble();
        if (X == 0 && Y == 0) {
            System.out.println("Quadrante 0");
        } else if (X > 0 && Y > 0) {
            System.out.println("Quadrante 1");
        } else if (X > 0 && Y < 0) {
            System.out.println("Quadrante 2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Quadrante 3");
        } else if (X < 0 && Y > 0) {
            System.out.println("Quadrante 4");
        }
        teclado.close();
    }
}