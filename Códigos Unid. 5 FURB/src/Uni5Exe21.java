public class Uni5Exe21 {
    public static void main(String[] args) {
        int anos = 0;
        double alturaChico = 1.50, alturaZe = 1.10;
        while (alturaChico > alturaZe) {
            anos = anos + 1;
            alturaZe = alturaZe + 0.03;
        }
        System.out.println("Levarão: " + anos + " anos para que o Zé se torne maior que o Chico");
    }
    
}