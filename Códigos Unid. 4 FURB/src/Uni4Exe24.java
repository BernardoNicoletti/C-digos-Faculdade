import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2, valor3;
        int escolha;
        valor1 = teclado.nextDouble();
        valor2 = teclado.nextDouble();
        valor3 = teclado.nextDouble();
        escolha = teclado.nextInt();
        switch (escolha) {
            case 1:
                if (escolha == 1) {
                    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.println(valor3);
                        System.out.println(valor2);
                        System.out.println(valor1);
                    } else if (valor1 < valor2 && valor1 < valor3 && valor3 > valor2) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
                        System.out.println(valor3);
                        System.out.println(valor1);
                        System.out.println(valor2);
                    } else if (valor2 < valor1 && valor2 < valor3 && valor3 > valor1) {
                        System.out.println(valor2);
                        System.out.println(valor1);
                        System.out.println(valor3);
                    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
                        System.out.println(valor2);
                        System.out.println(valor1);
                        System.out.println(valor3);
                    } else if (valor3 < valor1 && valor3 < valor2 && valor2 > valor1) {
                        System.out.println(valor3);
                        System.out.println(valor1);
                        System.out.println(valor2);
                    }
                }
                break;
            case 2:
                if (escolha == 2) {
                    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else if (valor1 < valor2 && valor1 < valor3 && valor3 > valor2) {
                        System.out.println(valor3);
                        System.out.println(valor2);
                        System.out.println(valor1);
                    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
                        System.out.println(valor2);
                        System.out.println(valor1);
                        System.out.println(valor3);
                    } else if (valor2 < valor1 && valor2 < valor3 && valor3 > valor1) {
                        System.out.println(valor3);
                        System.out.println(valor1);
                        System.out.println(valor2);
                    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
                        System.out.println(valor3);
                        System.out.println(valor1);
                        System.out.println(valor2);
                    } else if (valor3 < valor1 && valor3 < valor2 && valor2 > valor1) {
                        System.out.println(valor2);
                        System.out.println(valor1);
                        System.out.println(valor3);
                    }
                }
                break;
            case 3:
                if (escolha == 3) {
                    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                        System.out.println(valor3);
                        System.out.println(valor1);
                        System.out.println(valor2);
                    } else if (valor1 < valor2 && valor1 < valor3 && valor3 > valor2) {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
                        System.out.println(valor3);
                        System.out.println(valor2);
                        System.out.println(valor1);
                    } else if (valor2 < valor1 && valor2 < valor3 && valor3 > valor1) {
                        System.out.println(valor2);
                        System.out.println(valor3);
                        System.out.println(valor1);
                    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
                        System.out.println(valor2);
                        System.out.println(valor3);
                        System.out.println(valor1);
                    } else if (valor3 < valor1 && valor3 < valor2 && valor2 > valor1) {
                        System.out.println(valor3);
                        System.out.println(valor2);
                        System.out.println(valor1);
                    }
                }
                break;
        }
        teclado.close();
    }
}