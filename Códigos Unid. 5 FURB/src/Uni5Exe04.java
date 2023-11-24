public class Uni5Exe04 {

    public static void main(String[] args) {
        float soma = 0;
        int numerador = 3;
        float denominador = 2;
        int auxiliar = 4;
        // for (int quantidade = 1; quantidade <= 20; quantidade++) {
        for (int quantidade = 0; quantidade < 20; quantidade++) {
            System.out.println(numerador + "/" + denominador);
            soma += (numerador / denominador);
            // atualiza o termo:
            numerador += 2;
            denominador += auxiliar;
            auxiliar += 2;
        }
        System.out.println("SOMA = " + soma);
    }
}