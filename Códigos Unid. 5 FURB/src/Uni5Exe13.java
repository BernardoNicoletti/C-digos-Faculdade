import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double km = 0, kmTotal = 0, litrosTotal = 0;
        System.out.print("Digite o número de reabastecimentos: ");
        int reabastecimentos = teclado.nextInt();
        for (int i = 0; i < reabastecimentos; i++) {
            double kmAntigo = km;
            System.out.print("Quantidade abastecida na " + (i + 1) + "° parada (litros): ");
            double litros = teclado.nextDouble();
            System.out.print("Valor obtido no odômetro na " + (i + 1) + "° parada (km): ");
            km = teclado.nextDouble();
            if (i == 0) {
                kmAntigo = km;
            }
            double kmLParada = (km - kmAntigo) / litros;
            System.out.println("Quilometragem por litro na " + (i + 1) + "° parada: " + kmLParada + " km/L.");
            kmTotal = (kmTotal) + (km - kmAntigo);
            litrosTotal = litrosTotal + litros;
        }
        double kmLTotal = kmTotal / litrosTotal;
        System.out.println("Quilometragem por litro durante toda a viagem: " + kmLTotal + " km/L.");
        teclado.close();
    }
}
