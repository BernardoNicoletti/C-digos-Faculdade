import java.text.DecimalFormat;
import java.util.Scanner;

public class Prova02Questao01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double mediaIdade = 0, percentualPrimeiraFaixaEtaria = 0;
        double idade = 0, idade15 = 0, idade1630 = 0, idade3145 = 0, idade4660 = 0, idade61Mais = 0, pessoasTotal = 0,
                idadeTotal = 0;
        System.out.println("Informe a sua idade: ");
        idade = teclado.nextDouble();
        while (idade > 0) {
            if (idade <= 15) {
                idade15 += 1;
                pessoasTotal += 1;
            } else if (idade >= 16 && idade <= 30) {
                idade1630 += 1;
                pessoasTotal += 1;
            } else if (idade >= 31 && idade <= 45) {
                idade3145 += 1;
                pessoasTotal += 1;
            } else if (idade >= 46 && idade <= 60) {
                idade4660 += 1;
                pessoasTotal += 1;
            } else {
                idade61Mais += 1;
                pessoasTotal += 1;
            }
            idadeTotal += idade;
            mediaIdade = idadeTotal / pessoasTotal;
            System.out.println("Informe a sua idade: ");
            idade = teclado.nextDouble();
        }
        System.out.println("------ PESSOAS POR FAIXA ETÁRIA ------");
        System.out.println("Até 15 anos: " + idade15 + " pessoa(s).");
        System.out.println("De 16 até 30 anos: " + idade1630 + " pessoa(s).");
        System.out.println("De 31 até 45 anos " + idade3145 + " pessoa(s).");
        System.out.println("De 46 até 60 anos: " + idade4660 + " pessoa(s).");
        System.out.println("Acima de 61 anos: " + idade61Mais + " pessoa(s).");
        System.out.println();
        System.out.println("------ PERCENTUAL DE PESSOAS NA PRIMEIRA FAIXA ETÁRIA /TOTAL ------");
        percentualPrimeiraFaixaEtaria = 100 * (idade15 / pessoasTotal);
        System.out.println("Percentual de pessoas na primeira faixa etária em relação ao total é de: " +df_2.format(percentualPrimeiraFaixaEtaria) + "%");
        System.out.println();
        System.out.println("------ FAIXA ETÁRIA COM MAIS PESSOAS ------");
        if (idade15 > idade1630 && idade15 > idade3145 && idade15 > idade4660 && idade15 > idade61Mais) {
            System.out.println("A faixa etária com mais pessoas é: Até 15 anos");
        } else if (idade1630 > idade15 && idade1630 > idade3145 && idade1630 > idade4660 && idade1630 > idade61Mais) {
            System.out.println("A faixa etária com mais pessoas é: De 16 a 30 anos");
        } else if (idade3145 > idade15 && idade3145 > idade1630 && idade3145 > idade4660 && idade3145 > idade61Mais) {
            System.out.println("A faixa etária com mais pessoas é: De 31 a 45 anos");
        } else if (idade4660 > idade15 && idade4660 > idade1630 && idade4660 > idade3145 && idade4660 > idade61Mais) {
            System.out.println("A faixa etária com mais pessoas é: De 46 a 60 anos");
        } else if (idade61Mais > idade15 && idade61Mais > idade1630 && idade61Mais > idade3145 && idade61Mais > idade4660){
            System.out.println("A faixa etária com mais pessoas é: Acima de 61 anos");
        } 
        System.out.println();
        System.out.println("------ MÉDIA DE IDADE DAS PESSOAS INFORMADAS ------");
        System.out.println("A média de idade das pessoas informadas é de: " + df_2.format(mediaIdade) + " anos");
        teclado.close();
    }
}