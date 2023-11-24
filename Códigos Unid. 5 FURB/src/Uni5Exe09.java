import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0, idade = 0, idadeAcima = 0;
        String nomeAluno;
        System.out.println("Informe a quantidade de alunos que serão entrevistados: ");
        n = teclado.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("Informe o seu nome: ");
            nomeAluno = teclado.next();
            System.out.println("Informe a sua idade: ");
            idade = teclado.nextInt();
            if (idade == 18) {
                System.out.println("Esses são os nomes dos alunos que possuem 18 anos: " + nomeAluno);
            }
            if (idade > 20) {
                idadeAcima += 1;
            }
        }  
        System.out.println("A quantidade de alunos acima dos 20 anos de idade é de: " + idadeAcima);
        teclado.close();
    }
}
