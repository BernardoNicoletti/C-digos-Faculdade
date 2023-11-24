import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double anoInicio = 1995, salarioAntigo = 2000, porcentagem = 0.015, salarioAumento = 0, porcentagemAumento = 0, aumento = 0, salarioNovo = 0;
        aumento = salarioAntigo * porcentagem;
        salarioNovo = salarioAntigo + aumento; // 1996 -> R$ 2030
        while (anoInicio != 2000) {
            porcentagemAumento = porcentagem * 2;
            salarioNovo += salarioNovo * porcentagemAumento;
            anoInicio += 1;
            System.out.println(salarioNovo);
        } 
        teclado.close();
    }
}