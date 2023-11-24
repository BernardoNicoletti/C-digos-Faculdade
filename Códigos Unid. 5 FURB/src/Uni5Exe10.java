public class Uni5Exe10 {
    public static void main(String[] args) {
        for (int parte1 = 10; parte1 <= 99; parte1++) {
            for (int parte2 = 0; parte2 <= 99; parte2++) {
                int numero = Integer.parseInt(parte1 + "" + parte2);
                int soma = parte1 + parte2;

                if (Math.pow(soma,2) == numero) {
                    System.out.println(numero);
                }
            }
        }
    }
}