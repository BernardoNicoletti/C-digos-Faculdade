import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double notaProva1, notaProva2, notaProva3, media, notaExercicios;
        notaProva1 = teclado.nextDouble();
        notaProva2 = teclado.nextDouble();
        notaProva3 = teclado.nextDouble();
        notaExercicios = teclado.nextDouble();
        media = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + notaExercicios) / 7;
        if (media >= 9) {
            System.out.println("Média de aproveitamento: " + df_2.format(media) + " | Conceito: A | APROVADO");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Média de aproveitamento: " + df_2.format(media) + " | Conceito: B | APROVADO");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Média de aproveitamento: " + df_2.format(media) + " | Conceito: C | APROVADO");
        } else if (media >= 4 && media < 6) {
            System.out.println("Média de aproveitamento: " + df_2.format(media) + " | Conceito: D | REPROVADO");
        } else {
            System.out.println("Média de aproveitamento: " + df_2.format(media) + " | Conceito: E | REPROVADO");
        }
        teclado.close();
    }
}