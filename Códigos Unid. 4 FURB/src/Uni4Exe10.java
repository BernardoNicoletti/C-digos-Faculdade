import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeMaquinhos, idadeZezinho, idadeLuluzinha;
        idadeMaquinhos = teclado.nextInt();
        idadeZezinho = teclado.nextInt();
        idadeLuluzinha = teclado.nextInt();
        if (idadeMaquinhos > idadeZezinho && idadeMaquinhos > idadeLuluzinha && idadeZezinho > idadeLuluzinha) {
            System.out.println("Marquinhos é o mais velho entre os irmãos.");
        } else if (idadeMaquinhos < idadeZezinho && idadeMaquinhos < idadeLuluzinha && idadeLuluzinha > idadeZezinho) {
            System.out.println("Marquinhos é o irmão mais novo.");
        } else if (idadeZezinho > idadeMaquinhos && idadeZezinho > idadeLuluzinha && idadeMaquinhos > idadeLuluzinha) {
            System.out.println("Zezinho é o mais velho entre os irmãos.");
        } else if (idadeZezinho < idadeMaquinhos && idadeZezinho < idadeLuluzinha && idadeLuluzinha > idadeMaquinhos) {
            System.out.println("Zezinho é o irmão mais novo.");
        } else if (idadeLuluzinha > idadeMaquinhos && idadeLuluzinha > idadeZezinho && idadeMaquinhos > idadeZezinho) {
            System.out.println("Luluzinha é a irmã mais velha entre os irmãos");
        } else if (idadeLuluzinha < idadeMaquinhos && idadeLuluzinha < idadeZezinho && idadeZezinho > idadeMaquinhos) {
            System.out.println("Luluzinha é a irmã mais nova.");
        } else {
            System.out.println("A idade dos irmãos nunca se repete.");
        }
        teclado.close();
    }
}