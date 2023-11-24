import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcao;
        double base, altura, areaTriangulo, lado, areaQuadrado, areaRetangulo, raio, areaCirculo;
        System.out.println("Escolha uma opção: ");
        System.out.println("T | calcular a área de um triângulo de base b e altura h");
        System.out.println("Q | calcular a área de um quadrado de lado L");
        System.out.println("R | calcular a área de um retângulo de base b e altura h");
        System.out.println("C | calcular a área de um círculo de raio r");
        opcao = teclado.next();
        switch (opcao) {
            case "T":
                System.out.println("Digite a base e a altura do triangulo: ");
                base = teclado.nextDouble();
                altura = teclado.nextDouble();
                areaTriangulo = (base * altura) / 2;
                System.out.println("Área do triangulo: " + areaTriangulo);
                break;
            case "Q":
                System.out.println("Digite o lado: ");
                lado = teclado.nextDouble();
                areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            case "R":
                System.out.println("Digite a base e a altura do retângulo: ");
                base = teclado.nextDouble();
                altura = teclado.nextDouble();
                areaRetangulo = base * altura;
                System.out.println("Área do retângulo: " + areaRetangulo);
                break;
            case "C":
                System.out.println("Digite o raio: ");
                raio = teclado.nextDouble();
                areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do circulo: " + areaCirculo);
                break;
        }
        teclado.close();
    }
}