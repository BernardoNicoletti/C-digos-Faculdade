import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int canal = 0, pessoas = 0;
        double somapessoas = 0,somaCanal4=0,somaCanal5=0,somaCanal9=0,somaCanal12=0;
        double canal4,canal5,canal9,canal12;
        while (true) {
            System.out.println("Digite o número do canal: ");
            canal = input.nextInt();
            if (canal == 0) {
             break;
            }
            System.out.println("Digite o número de pessoas");
            pessoas = input.nextInt();
            somapessoas = somapessoas + pessoas;
            if(canal == 4){
               somaCanal4 = somaCanal4 + pessoas;
            }
            if(canal == 5){
              somaCanal5 = somaCanal5 + pessoas;
            }
            if(canal == 9){
               somaCanal9 = somaCanal9 +  pessoas;
            }
            if(canal == 12){
                somaCanal9 = somaCanal9 +  pessoas;
            }
        }
        canal4 = somaCanal4 / somapessoas;
        canal9 = somaCanal9 / somapessoas;
        canal5 = somaCanal5 / somapessoas;
        canal12 = somaCanal12 / somapessoas;
        System.out.println("Canal 4");
        System.out.println("O porcentual de audiencia é: " + canal4*100 + "%" );
        System.out.println("Canal 5");
        System.out.println("O porcentual de audiencia é: " + canal5*100 + "%" );
        System.out.println("Canal 9");
        System.out.println("O porcentual de audiencia é: " + canal9*100 + "%");
        System.out.println("Canal 12");
        System.out.println("O porcentual de audiencia é: " + canal12*100 + "%");
        input.close();
    }
}