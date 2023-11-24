/*
Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante uma viagem de 
final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, 
sabendo que o automóvel faz 12 km por litro. 
*/
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempo, quilometragem, litrosGastos, velocidadeMedia;
        System.out.println("Quantos quilometros você percorreu nesta última viagem?");
        quilometragem = teclado.nextDouble();
        System.out.println("Quanto tempo você utilizou desde o início até o fim da viagem?");
        tempo = teclado.nextDouble();
        velocidadeMedia = quilometragem / tempo; 
        litrosGastos = quilometragem / 12;
        System.out.println("A velocidade média da viagem foi: " + velocidadeMedia + "Km/H");
        System.out.println("Você gastou: " + litrosGastos + "litros de gasolina.");
        teclado.close();
    }
}
