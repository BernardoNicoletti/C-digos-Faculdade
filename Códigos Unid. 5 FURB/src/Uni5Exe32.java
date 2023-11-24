import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite em que dia cai o primeiro dia do mês e o número de dias que o mês possui:");
        int diaDaSemana = teclado.nextInt();
        int qntDias = teclado.nextInt();
        int dia = 0;
        int dias1Semana = 0;
        String espaço = "";

        System.out.println("D    S    T    Q    Q    S    S");
        while (dia != qntDias) {

            if (dias1Semana == 0) {
                switch (diaDaSemana) {
                    case 1:
                        espaço = "";
                        dias1Semana = 7;
                        break;
                    case 2:
                        espaço = "      ";
                        dias1Semana = 6;
                        break;
                    case 3:
                        espaço = "          ";
                        dias1Semana = 5;
                        break;
                    case 4:
                        espaço = "             ";
                        dias1Semana = 4;
                        break;
                    case 5:
                        espaço = "                  ";
                        dias1Semana = 3;
                        break;
                    case 6:
                        espaço = "                      ";
                        dias1Semana = 2;
                        break;
                    case 7:
                        espaço = "                         ";
                        dias1Semana = 1;
                        break;
                }
                System.out.print(espaço);
            } else {

                for (int j = 1; j <= dias1Semana; j++) {
                    dia++;
                    System.out.print(dia + "   ");
                    if (dia == qntDias) {
                        break;
                    }
                }
                dias1Semana = 7;
                System.out.println();
            }
        }
        teclado.close();
    }
}
