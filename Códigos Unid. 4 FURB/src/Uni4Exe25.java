import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double valor1, valor2, resultado;
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        opcao = teclado.nextInt();
        valor1 = teclado.nextDouble();
        valor2 = teclado.nextDouble();
        switch (opcao) {
            case 1:
                resultado = valor1 + valor2;
                System.out.println("A soma dos dois números é de: " + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("A diferença entre os dois números é de: " + resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("O produto entre os dois números é de: " + resultado);
                break;
            case 4:
                if (valor2 == 0) {
                    break;
                } else if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.println("A divisão entre os dois números é de: " + resultado);
                }
                break;
            case 5:
                if (opcao < 1 && opcao > 4) {
                    break;
                }
        }
        teclado.close();
    }
}
