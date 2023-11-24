import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2, somaVelho, produtoNovo;
        idadeHomem1 = teclado.nextInt();
        idadeHomem2 = teclado.nextInt();
        idadeMulher1 = teclado.nextInt();
        idadeMulher2 = teclado.nextInt();
        if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2) {
            somaVelho = idadeHomem1 + idadeMulher2;
            produtoNovo = idadeHomem2 * idadeMulher1;
            System.out.println("Soma da idade do homem mais velho com a mulher mais nova é: " + somaVelho + " anos.");
            System.out.println("O produto das idades entre o homem mais novo e a mulher mais velha é: " + produtoNovo + " anos.");
        } else if (idadeHomem1 < idadeHomem2 && idadeMulher1 < idadeMulher2) {
            somaVelho = idadeHomem2 + idadeMulher1;
            produtoNovo = idadeHomem1 * idadeMulher2;
            System.out.println("Soma da idade do homem mais velho com a mulher mais nova é: " + somaVelho + " anos.");
            System.out.println("O produto das idades entre o homem mais novo e a mulher mais velha é: " + produtoNovo + " anos.");
        }
        teclado.close();
    }
}