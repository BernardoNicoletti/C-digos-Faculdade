import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double altura, alturaF = 0, mediaF = 0, mediaT = 0, somaAlturaTotal = 0, alturaM = 0, alturaO = 0, mediaH = 0,
                mediaO = 0;
        String sexo;
        while (true) {
            System.out.println("Entre com a altura da pessoa: (0 para finalizar)");
            altura = teclado.nextDouble();
            if (altura == 0) {
                System.out.println("Está encerrado");
                break;
            }
            System.out.println("Entre com o sexo da pessoa: ");
            sexo = teclado.next();
            somaAlturaTotal = somaAlturaTotal + altura;
            if (sexo.equalsIgnoreCase("f")) {
                alturaF = alturaF + altura;
                mediaF++;
            }
            if (sexo.equalsIgnoreCase("m")) {
                alturaM = alturaM + altura;
                mediaH++;
            }
            if (sexo.equalsIgnoreCase("o")) {
                alturaO = alturaO + altura;
                mediaO++;
            }
            mediaT = mediaF + mediaH + mediaO;
        }
        double mediaM = alturaF / mediaF;
        double mediaHo = alturaM / mediaH;
        double mediaOu = alturaO / mediaO;
        double mediaOutros = somaAlturaTotal / mediaT;
        System.out.println("A media das alturas das mulheres: " + mediaM);
        System.out.println("A media das alturas do grupo: " + mediaOutros);
        System.out.println("A media das alturas das homens: " + mediaHo);
        System.out.println("A media das alturas dos outros: " + mediaOu);
        teclado.close();
    }
}