import java.util.Scanner;

public class Prova02Questao02 {
    public static void main(String[] args) {
        new Prova02Questao02();
    }

    public Prova02Questao02() {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[10];
        int pacote[] = new int[10];
        int posicaoAtual = 0;
        int posicao = 0;
        String opcao;
        do {
            System.out.println("Digite uma opção: \nA - Cadastrar pacote");
            System.out.println("B - Consultar pacote\nC - Enviar pacote");
            System.out.println("D - Mostrar pacote\nE - Sair");
            opcao = teclado.next().toUpperCase();
            switch (opcao) {
                case "A":
                    posicao = cadastrar(teclado, vetor, posicao);
                    break;
                case "B":
                    consultarPacote(teclado, vetor, posicaoAtual);
                    break;
                case "C":
                    posicaoAtual = enviarPacote(teclado, vetor, posicaoAtual, pacote);
                    break;
                case "D":
                    mostrarPacote(vetor, pacote, posicaoAtual, posicaoAtual, teclado, posicaoAtual);
                    break;
                case "E":
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao.equals("A") || opcao.equals("B") || opcao.equals("C") || opcao.equals("D"));
        teclado.close();
    }

    private int cadastrar(Scanner teclado, int[] vetor, int posicao) {
        boolean controle = false;
         if (posicao != vetor.length) {
             System.out.print("Digite o código do pacote: ");
             int numero = teclado.nextInt();
             for (int i = 0; i < vetor.length; i++) {
                 if (vetor[i] == numero) {
                     System.out.println("Valor já existente");
                     controle = true;
                     break;
                 }
                 if(controle = true){
                     vetor[posicao] = numero;
                     posicao++;
                     break;
 
                 }
             }
         }
         else {
             System.out.println("O espaço total de pacotes já está cheio!");
         }
         return posicao;
     }

    private int consultarPacote(Scanner teclado, int[] vetor, int posAtual) {
        System.out.print("Digite o código do pacote para consulta: ");
        int numero = teclado.nextInt();
        // boolean achou = false;
        int posicaoEncontrado = -1;
        for (int i = 0; i < posAtual; i++) {
            if (vetor[i] == numero) {
                // achou = true;
                posicaoEncontrado = i;
                break;
            }
        }
        if (posicaoEncontrado != -1) {
            System.out.println("Pacote encontrado " + posicaoEncontrado);
        } else {
            System.out.println("Pacote não encontrado");
        }
        return posicaoEncontrado;
    }

    private int enviarPacote(Scanner teclado, int[] vetor, int posicaoAtual, int[] pacote) {
        int armazenador = 0;
        boolean enviar = false;
        System.out.println("Digite o código do pacote:");
        int codigo = teclado.nextInt();
        for (int i = 0; i < pacote.length; i++) {
            if (vetor[i] == codigo) {
                vetor[i] = 0;
            }
                vetor[i] = vetor[posicaoAtual];
                vetor[posicaoAtual] = 0;
            
            enviar = true;
        }
        pacote[armazenador] = codigo;
        armazenador++;

    if(enviar) {
        System.out.println("Pacote enviado!");
    }else {
        System.out.println("Este pacote não existe para ser enviado");
    }
    posicaoAtual--;
    return posicaoAtual;
    }

    private void ordenarValores(int[] vetor, int bolha, int i) {
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

    private void mostrarPacote(int vetor[], int[] pacote, int i, int bolha, Scanner teclado, int j) {
        System.out.println("A - para armazém ");
        System.out.println("E - para pacote enviados ");
        String resposta = teclado.next();
        if (resposta.equalsIgnoreCase("A")) {
            for (i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
        if (resposta.equalsIgnoreCase("E")) {
            for (i = 0; i < vetor.length; i++) {
                System.out.print(pacote[i] + " ");
            }
        }
    }
}
