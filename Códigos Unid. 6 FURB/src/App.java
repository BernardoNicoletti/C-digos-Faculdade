public class App {
    public static void main(String[] args) throws Exception {
        int resultado = 0;
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            if (vetor[i] % 2 != 0) {
                resultado += vetor[i];
            }
        }
        System.out.println(resultado);
    }
}
// Exemplo crescente 
/*int posiçãoAtual = 0;
        int numeroNovo;
        while (posiçãoAtual < numeros.length-1) {
            if (numeros[posiçãoAtual] > numeros[posiçãoAtual + 1]) {
                numeroNovo = numeros[posiçãoAtual];
                numeros[posiçãoAtual] = numeros[posiçãoAtual + 1];
                numeros[posiçãoAtual + 1] = numeroNovo;
                posiçãoAtual = 0;
            }
            else{
                posiçãoAtual++;
            }
        }  
*/
/* 
 * private void ordenarValores(int[] vetor, int bolha, int i) {
        while (i < vetor.length - 1) {
            if (vetor[i] > vetor[i + 1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;
            } else {
                i = i + 1;
            }
        }
    }

    private void inverterValores(int[] vetor, int i) {
        int temp = 0;
        for (i = 0; i < vetor.length; i++) {
            for (int x = 0; x < i; x++) {
                temp = vetor[i];
                vetor[i] = vetor[x];
                vetor[x] = temp;
            }
        }
    }
*/
