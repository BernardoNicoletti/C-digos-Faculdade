//import java.text.DecimalFormat;
import java.util.Scanner;

// REVISAR A MASSA
public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //DecimalFormat df_2 = new DecimalFormat("0.00");
        double massaInicial, massaFinal = 0, tempoTotal = 0, conversaoTempoTotal = 0, conversaoMassaInicial;
        int i = 0;
        System.out.println("Informe a massa do seu elemento: ");
        massaInicial = teclado.nextDouble();
        conversaoMassaInicial = massaInicial * 1000;
        while (i <= 4) {
            if (massaInicial > 0) {
                massaFinal = conversaoMassaInicial / 2;
                tempoTotal = tempoTotal + 50;
                if (massaFinal <= 0.5) {
                    break;
                }
            } else if (massaInicial <= 0) {
                break;
            }
            i++;
        }
        conversaoTempoTotal = tempoTotal / 60;
        System.out.println("A massa inicial do seu elemento em KG era de: " + massaInicial + " e a massa inicial do seu elemento em GRAMAS era de: " + conversaoMassaInicial);
        System.out.println("A massa final do seu elemento é de: " + massaFinal);
        //System.out.println("O tempo total em SEGUNDOS foi de: " + tempoTotal + " e o seu tempo total em MINUTOS foi de: " + df_2.format(conversaoTempoTotal));
        System.out.printf("O tempo total em SEGUNDOS foi de: " + tempoTotal + " e o seu tempo total em MINUTOS foi de: " + "%.2f", conversaoTempoTotal);
        teclado.close();
    }
}