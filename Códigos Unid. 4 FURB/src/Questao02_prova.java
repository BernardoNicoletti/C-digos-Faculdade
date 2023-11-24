import java.util.Scanner;

public class Questao02_prova {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String codigo;
        double salario, salarioAumento, porcentagemAumento;
        codigo = teclado.next().toUpperCase();
        if (codigo.equals(("A")) || codigo.equals(("B")) ||
                codigo.equals(("C")) || codigo.equals(("D")) ||
                codigo.equals(("E")) || codigo.equals(("F"))) {
            switch (codigo) {
                case "A":
                    salario = teclado.nextDouble();
                    if (salario > 9000) {
                        System.out.println("O salário do Enfermeiro não pode ultrapassar os R$9000,00");
                        break;
                    } else {
                        porcentagemAumento = salario * 0.20;
                        salarioAumento = porcentagemAumento + salario;
                        System.out.println("Cargo: Enfermeiro");
                        System.out.println("Valor do aumento: " + porcentagemAumento);
                        System.out.println("Novo salário: " + salarioAumento);
                    }
                    break;
                case "B":
                    salario = teclado.nextDouble();
                    if (salario >= 10000 && salario <= 20000) {
                        porcentagemAumento = salario * 0.10;
                        salarioAumento = porcentagemAumento + salario;
                        System.out.println("Cargo: Dentista");
                        System.out.println("Valor do aumento: " + porcentagemAumento);
                        System.out.println("Novo salário: " + salarioAumento);
                        break;
                    } else {
                        System.out.println(
                                "O salário do Dentista não pode ser inferior a R$10000,00 e nem maior que R$20000,00");
                    }
                    break;
                case "C":
                    salario = teclado.nextDouble();
                    if (salario >= 10000 && salario <= 20000) {
                        porcentagemAumento = salario * 0.10;
                        salarioAumento = porcentagemAumento + salario;
                        System.out.println("Cargo: Clínico Geral");
                        System.out.println("Valor do aumento: " + porcentagemAumento);
                        System.out.println("Novo salário: " + salarioAumento);
                        break;
                    } else {
                        System.out.println(
                                "O salário do Clínico Geral não pode ser inferior a R$10000,00 e nem maior que R$20000,00");
                    }
                    break;
                case "D":
                    salario = teclado.nextDouble();
                    if (salario >= 15000) {
                        porcentagemAumento = salario * 0.05;
                        salarioAumento = porcentagemAumento + salario;
                        System.out.println("Cargo: Ortopedista");
                        System.out.println("Valor do aumento: " + porcentagemAumento);
                        System.out.println("Novo salário: " + salarioAumento);
                        break;
                    } else {
                        System.out.println("O salário do Ortopedista não pode ser inferior a R$15000,00");
                    }
                    break;
                case "E":
                    salario = teclado.nextDouble();
                    if (salario >= 15000) {
                        porcentagemAumento = salario * 0.05;
                        salarioAumento = porcentagemAumento + salario;
                        System.out.println("Cargo: Cardiologista");
                        System.out.println("Valor do aumento: " + porcentagemAumento);
                        System.out.println("Novo salário: " + salarioAumento);
                        break;
                    } else {
                        System.out.println("O salário do Cardiologista não pode ser inferior a R$15000,00");
                    }
                    break;
                case "F":
                    salario = teclado.nextDouble();
                    if (salario >= 30000) {
                        System.out.println("Cargo: Diretor de Setor");
                        System.out.println("Valor do aumento: NÂO POSSUI");
                        System.out.println("Novo salário: " + salario);
                        break;
                    } else {
                        System.out.println("O salário do Diretor de Setor não pode ser inferior a R$30000,00");
                    }
                    break;
            }
        } else {
            System.out.println("Código Inválido");
        }
        teclado.close();
    }
}
