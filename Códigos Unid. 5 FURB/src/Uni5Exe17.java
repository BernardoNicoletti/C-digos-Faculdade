import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        while (i <= 3) {
            double alturaAtleta1 = teclado.nextDouble();
            double numeroInscricao1 = teclado.nextDouble();
            double alturaAtleta2 = teclado.nextDouble();
            double numeroInscricao2 = teclado.nextDouble();
            double alturaAtleta3 = teclado.nextDouble();
            double numeroInscricao3 = teclado.nextDouble();
            if (numeroInscricao1 == 0){
                break;
            } else if (numeroInscricao2 == 0) {
                break;
            } else if (numeroInscricao3 == 0) {
                break;
            }
            if (alturaAtleta1 > alturaAtleta2 && alturaAtleta1 > alturaAtleta3 && alturaAtleta2 > alturaAtleta3) {
                System.out.println("O número de inscrição: " + numeroInscricao1 + " Altura do atleta mais alto: " + alturaAtleta1);
                System.out.println("O número de inscrição: " + numeroInscricao3 + " Altura do atleta mais baixo: " + alturaAtleta3);
            } else if (alturaAtleta1 < alturaAtleta2 && alturaAtleta1 < alturaAtleta3 && alturaAtleta3 > alturaAtleta2) {
                System.out.println("O número de inscrição: " + numeroInscricao3 + " Altura do atleta mais alto: " + alturaAtleta3);
                System.out.println("O número de inscrição: " + numeroInscricao1 + " Altura do atleta mais baixo: " + alturaAtleta1);
            } else if (alturaAtleta2 > alturaAtleta1 && alturaAtleta2 > alturaAtleta3 && alturaAtleta1 > alturaAtleta3) {
                System.out.println("O número de inscrição: " + numeroInscricao2 + " Altura do atleta mais alto: " + alturaAtleta2);
                System.out.println("O número de inscrição: " + numeroInscricao3 + " Altura do atleta mais baixo: " + alturaAtleta3);
            } else {
                System.out.println("O número de inscrição: " + numeroInscricao3 + " Altura do atleta mais alto: " + alturaAtleta3);
                System.out.println("O número de inscrição: " + numeroInscricao2 + " Altura do atleta mais baixo: " + alturaAtleta2);
            }
            teclado.close();
        }
    }
}