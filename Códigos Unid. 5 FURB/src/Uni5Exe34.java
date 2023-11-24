import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diarias, opcao, contasEncerradas = 0, contagem = 0;
        double valorPagar;
        String nomeHospede;
        do {
            System.out.println("Escolha uma opcão: ");
            System.out.println("[1] Encerrar a conta do hóspede");
            System.out.println("[2] Verificar o número de contas encerradas");
            System.out.println("[3] Sair");
            opcao = teclado.nextInt();
            if (opcao == 3) {
                break;
            }
            switch (opcao) {
                case 1:
                    contasEncerradas += 1;
                    System.out.println("Informe o nome do hóspede: ");
                    nomeHospede = teclado.next();
                    System.out.println("Informe quantas diárias o hóspde ficou em nosso hotel: ");
                    diarias = teclado.nextInt();
                    if (diarias > 15) {
                        valorPagar = diarias * 7.50;
                    } else if (diarias == 15) {
                        valorPagar = diarias * 6.50;
                    } else {
                        valorPagar = diarias * 5;
                    }
                    System.out.println(nomeHospede + " esperamos que tenha gostado do nosso espaço :)");
                    System.out.println("O valor a ser pago pelas diárias é de: R$" + valorPagar);
                case 2:
                    System.out.println("O número de contas encerradas foi de: " + contasEncerradas);
            }
            contagem += 1;
        } while (contagem <= 3);
        teclado.close();
    }
}