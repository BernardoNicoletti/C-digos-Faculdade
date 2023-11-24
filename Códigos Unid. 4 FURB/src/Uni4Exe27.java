import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaEntrada, minutoEntrada, horaSaida, minutoSaida;
        double taxa = 5, taxa2 = 10, taxa3 = 7.50, taxa4 = 15, taxa5 = 10, tempo, pagamento = 0, hora5, taxap;
        System.out.print("Digite a hora e minutos de entrada : ");
        horaEntrada = teclado.nextInt();
        minutoEntrada = teclado.nextInt();
        System.out.print("Digite a hora e minutos de saída: ");
        horaSaida = teclado.nextInt();
        minutoSaida = teclado.nextInt();
        tempo = (horaSaida * 60 + minutoSaida) - (horaEntrada * 60 + minutoEntrada);
        if (tempo <= 89) {
            pagamento = taxa;
        }
        if (tempo > 89 && tempo <= 149) {
            pagamento = taxa2;
        }
        if (tempo > 149 && tempo <= 209) {
            pagamento = taxa2 + taxa3;
        }
        if (tempo > 209 && tempo <= 269) {
            pagamento = taxa3 + taxa2 + taxa4;
        }
        if (tempo > 269 && tempo <= 329) {
            pagamento = taxa2 + taxa3 + taxa4 + taxa5;
        }
        if (tempo > 329) {
            if ((tempo % 60 <= 29 && tempo > 329)) {
                hora5 = 10 * (((int) tempo / 60) - 5);
                pagamento = hora5 + taxa5 + taxa4 + taxa3 + taxa2;
            } else if ((tempo % 60 > 29 && tempo > 329)) {
                taxap = Math.round(tempo / 60);
                hora5 = 10 * (taxap - 5);
                pagamento = hora5 + taxa5 + taxa4 + taxa3 + taxa2;
            }
        }
        System.out.println("Tempo de permanência: " + (int) (tempo / 60) + " Horas " + (tempo % 60) + " Minutos");
        System.out.println("Taxa a ser cobrada: R$ " + pagamento);
        teclado.close();
    }
}