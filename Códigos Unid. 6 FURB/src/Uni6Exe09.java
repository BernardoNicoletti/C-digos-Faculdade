import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        new Uni6Exe09();
    }

    public Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);
        int[] sexo = new int[2];
        int idade[] = new int[2];
        double[] notas = new double[2];
        double soma = 0, media = 0, mediaHomem = 0, somaHomem = 0, mediaCinema = 0;
        int notaMulheresAcima = 0, homens = 0, bolha = 0;
        sexo(sexo, teclado, homens);
        notas(notas, teclado);
        idade(idade, teclado);
        mulheresAcima(notas, somaHomem, mediaCinema, idade, sexo, notaMulheresAcima);
        mediaHomens(notas, somaHomem, mediaCinema, mediaHomem, homens, idade, sexo, homens);
        mediaFilme(notas, mediaCinema, somaHomem);
        mulherMaisJovem(notaMulheresAcima, idade, bolha, notas);
        teclado.close();
    }

    private void sexo(int[] sexo, Scanner teclado, int homens) {
        for (int i = 0; i < sexo.length; i++) {
            System.out.println("Informe o seu sexo: ");
            System.out.println("[1] - Feminino");
            System.out.println("[2] - Masculino");
            sexo[i] = teclado.nextInt();
            if (sexo[i] == 2) {
                homens += 1;
            }
        }
    }

    private void notas(double[] notas, Scanner teclado) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a sua nota para o filme de 0 a 10: ");
            notas[i] = teclado.nextDouble();
        }
    }

    private void idade(int[] idade, Scanner teclado) {
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Informe a sua idade: ");
            idade[i] = teclado.nextInt();
        }
    }

    private void mulheresAcima(double[] notas, double soma, double media,
            int[] idade, int[] sexo, double notaMulheresAcima) {
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            media = soma / notas.length;
            if (idade[i] > 50 && sexo[i] == 1 && notas[i] > media) {
                notaMulheresAcima += 1;
            }
        }
        System.out.println("A quantidade de mulheres acima de 50 anos que deram nota acima da média foi de: " + notaMulheresAcima);
    }
    private void mediaHomens(double[] notas, double soma, double media, double mediaHomem, int somaHomem,
            int[] idade, int[] sexo, int homens) {
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            media = soma / notas.length;
            if (sexo[i] == 2) {
                somaHomem += notas[i];
                mediaHomem = somaHomem / homens;
            }
        }
        System.out.println("A média atribuida pelos homens é de: " + mediaHomem);
    }

    private void mediaFilme(double[] notas, double mediaCinema, double soma) {
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            mediaCinema = soma / notas.length;
        }
        System.out.println("A média do filme foi de: " + mediaCinema);
    }

    private void mulherMaisJovem(int i, int[] idade, int bolha, double[] notas) {
        while (i < idade.length - 1) {
            if (idade[i] > idade[i + 1]) {
                bolha = idade[i];
                idade[i] = idade[i + 1];
                idade[i + 1] = bolha;
                i = 0;
            } else {
                i = i + 1;
            }
            
        }
        System.out.println("A nota atribuída pela mulher mais jovem foi de: " + notas[0]);
    }

}
