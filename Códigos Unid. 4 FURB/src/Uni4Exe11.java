import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filho1, filho2, filho3;
        filho1 = teclado.nextInt();
        filho2 = teclado.nextInt();
        filho3 = teclado.nextInt();
        if (filho1 == filho2 && filho3 == filho2 && filho1 == filho3) {
            System.out.println("TRIGÊMEOS");
        } else if ((filho1 == filho2) || (filho2 == filho3) || (filho1 == filho3) && (filho3 != filho1)) {
            System.out.println("GÊMEOS");
        } else if ((filho1 == filho2) || (filho2 == filho3) || (filho1 == filho3) && (filho1 != filho2)) {
            System.out.println("GÊMEOS");
        } else if ((filho1 == filho2) || (filho2 == filho3) || (filho1 == filho3) && (filho2 != filho3)) {
            System.out.println("GÊMEOS");
        } else if (filho1 != filho2 && filho2 != filho3 && filho3 != filho1) {
            System.out.println("IRMÂOS");
        }
        teclado.close();
    }
}
