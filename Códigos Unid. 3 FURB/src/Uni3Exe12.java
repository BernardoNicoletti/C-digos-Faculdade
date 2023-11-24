/*
Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o 
número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por 
dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o 
INSS e de 5% sobre o salário trabalho para o imposto de renda. Descreva um programa que informe o nome, 
o salário bruto e o salário líquido do funcionário. 
*/

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome; 
        double horasTrabalhadas, dependentes, descontoTotal, salarioBruto, salarioLiquido;
        double INSS = 0.085, imposto1;
        double impostoDeRenda = 0.05, imposto2; 
        System.out.println("Informe o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe quantos dependentes moram com você: ");
        dependentes = teclado.nextDouble();
        System.out.println("Informe quantas horas você trabalhou essa semana: ");
        horasTrabalhadas = teclado.nextDouble();
        dependentes = dependentes * 60;
        imposto1 = (horasTrabalhadas * 10 + dependentes) * INSS; // com 20 horas, temos 200 reais (sem independetes) - o INSS fica 183 = 17
        imposto2 = (horasTrabalhadas * 10 + dependentes) * impostoDeRenda; // tirando o impostoDeRenda vai restar 190 (sem independentes) = 10 
        descontoTotal = imposto1 + imposto2; 
        salarioBruto = (horasTrabalhadas * 10) + dependentes;
        salarioLiquido = salarioBruto - descontoTotal; 
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário bruto do funcionário: R$" + salarioBruto); 
        System.out.println("Salário líquido do funcionário: R$" + salarioLiquido);
        teclado.close();
    }
}
