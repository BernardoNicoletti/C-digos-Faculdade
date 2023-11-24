import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, ano;
        System.out.println("Digite o dia:");
        dia = input.nextInt();
        System.out.println("Digite o mes:");
        mes = input.nextInt();
        System.out.println("Digite o ano:");
        ano = input.nextInt();
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Data valída");
            } else {
                if (dia < 31 && mes != 2) {
                    System.out.println("Data valída");
                } else {
                    if (mes == 2 && dia < 29) {
                        System.out.println("Data valída");
                    }
                    else {
                        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
                            System.out.println("Data valída");
                        } else {
                            System.out.println("Não valída");
                        }
                    }
                }
            }
        } else {
            System.out.println("Não valída");
        }
        input.close();
    }
}