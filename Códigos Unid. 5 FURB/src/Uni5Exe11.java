public class Uni5Exe11 {
    public static void main(String[] args) {
        int biscoitosQuebrados = 0, biscoitoDaPrimeira = 1, biscoitos = 3;
        for (int i = 0; i <= 13; i++) {
            biscoitos = biscoitos * 2;
            biscoitosQuebrados = biscoitos + biscoitoDaPrimeira; 
        }
        System.out.println("Ao final de cada dia teremos: " + biscoitosQuebrados + " biscoitos quebrados, com a máquina operando 16 horas por dia");
    }
}