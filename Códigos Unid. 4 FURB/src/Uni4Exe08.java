import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letraInformada;
        letraInformada = teclado.next();
        if(letraInformada.equals(("a")) || letraInformada.equals(("e")) || letraInformada.equals(("i")) || letraInformada.equals(("o")) || letraInformada.equals(("u"))) {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }
        teclado.close();
    }
}