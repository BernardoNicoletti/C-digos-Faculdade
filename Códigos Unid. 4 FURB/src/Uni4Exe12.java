import java.util.Scanner;
// RESOLVER
public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;
        lado1 = teclado.nextDouble();
        lado2 = teclado.nextDouble();
        lado3 = teclado.nextDouble();
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Não é possível formar um triângulo com esses números");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triângulo equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo isócele");  
        } else {
            System.out.println("Triângulo Escaleno");
        }
        teclado.close();
    }
}