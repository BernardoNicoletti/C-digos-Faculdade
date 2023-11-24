import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double limiteDiario = 0, pesoPeixe = 0, pesoTotal = 0;
        String escolha;
        while(true) {
            System.out.println("Informe o limite diário (KG): ");
            limiteDiario = teclado.nextDouble();
            System.out.println("Informe o peso do peixe (GRAMAS): ");
            pesoPeixe = teclado.nextDouble();
            pesoPeixe = pesoPeixe / 1000;
            pesoTotal = pesoTotal + pesoPeixe;
            if (limiteDiario <= pesoPeixe) {
                break;
            }
            System.out.println("Deseja informar o peso de mais um peixe: S(SIM ou N(NÂO)");
            escolha = teclado.next();
            if (escolha.trim().equalsIgnoreCase("N")) {
                System.out.println("Encerrado");
                break;
            }
        }
        System.out.println("O total do peso pescado é de: " + pesoTotal);
        teclado.close();
    }
}