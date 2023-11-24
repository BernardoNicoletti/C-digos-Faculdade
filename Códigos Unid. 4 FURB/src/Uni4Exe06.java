import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letraInformada;
        letraInformada = teclado.next();
        if(letraInformada.equals("M")){
            System.out.println("Masculino");
        } else if(letraInformada.equals("F")) {
            System.out.println("Feminino");
        }else if(letraInformada.equals("I")){
            System.out.println("Não informado");
        }else {
            System.out.println("Entrada incorreta");
        }
        teclado.close();
    }
}