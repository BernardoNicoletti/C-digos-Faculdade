import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolhaCurso;
        escolhaCurso = teclado.nextInt();
        switch (escolhaCurso) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            case 4:
                System.out.println("Essa opção de curso está indisponível");
                break;
        }
        teclado.close();
    }
}