import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int senha, resposta, i = 0;
        System.out.println("Informe a senha desejada: ");
        senha = teclado.nextInt();
        while (i < 6) {
            System.out.println("Informe a senha correta para acessar: ");
            resposta = teclado.nextInt();
            if (resposta == senha) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Inválida");
            }
            i++;
        }
        teclado.close();
    }
}