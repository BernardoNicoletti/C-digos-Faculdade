import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Tamanho da mochila (M): ");
        int m = teclado.nextInt();
        System.out.println("Valor inicial (N): ");
        int n = teclado.nextInt();
        System.out.println("Valor incremento (K): ");
        int k = teclado.nextInt();
        int quantidade = 0, somaInternos = 0, somaExternos = 0;
        String elementosInternos = "", elementosExternos = "";
        while (quantidade < m) {
            elementosInternos += n + " ";
            somaInternos += n;
            quantidade++;
        }
        while (n >= 0) {
            elementosExternos += n + " ";
            somaExternos += n;
            n -= k;
        }
        System.out.println("Todos: " + elementosInternos + elementosExternos);
        System.out.println("Internos: " + elementosInternos);
        System.out.println("Externos: " + elementosExternos);
        System.out.println("Soma internos: " + somaInternos);
        System.out.println("Soma externos: " + somaExternos);
        teclado.close();
    }
}