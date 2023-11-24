import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0, voto, nenhumDeNos = 0, cpm22 = 0, skank = 0, jotaQuest = 0, percentualNenhum, percentualcpm22,
                percentualskank, percentualjotaQuest;
        String opcao;
        System.out.println("------ VOTAÇÃO PARA A MELHOR BANDA ------");
        System.out.println("Código 1 | Nenhum de nós");
        System.out.println("Código 2 | CPM22");
        System.out.println("Código 3 | Skank");
        System.out.println("Código 4 | Jota Quest");
        System.out.println("Lembre-se, você pode votar somente 10 vezes!");
        while (i <= 9) {
            System.out.println("Deseja fazer o seu primeiro voto / mais um voto: S(SIM) | N(NÂO)");
            opcao = teclado.next();
            if (opcao.equalsIgnoreCase("s")) {
                voto = teclado.nextInt();
                switch (voto) {
                    case 1:
                        nenhumDeNos = nenhumDeNos + 1;
                        break;
                    case 2:
                        cpm22 = cpm22 + 1;
                        break;
                    case 3:
                        skank = skank + 1;
                        break;
                    case 4:
                        jotaQuest = jotaQuest + 1;
                        break;
                }
                voto = 0;
                i++;
            } else {
                break;
            }
        }
        percentualNenhum = nenhumDeNos * 10;
        percentualcpm22 = cpm22 * 10;
        percentualskank = skank * 10;
        percentualjotaQuest = jotaQuest * 10;
        System.out.println("------ TOTAL DE VOTOS PARA CADA BANDA ------");
        System.out.println("Total de votos para Nenhum de nós: " + nenhumDeNos + " voto(s)");
        System.out.println("Total de votos para CPM22: " + cpm22 + " voto(s)");
        System.out.println("Total de votos para Skank: " + skank + " voto(s)");
        System.out.println("Total de votos para Jota Quest: " + jotaQuest + " voto(s)");
        System.out.println("");
        System.out.println("------ PERCENTUAL DOS VOTOS ------");
        System.out.println("Percentual de votos para Nenhum de nós: " + percentualNenhum + "%");
        System.out.println("Percentual de votos para CPM22: " + percentualcpm22 + "%");
        System.out.println("Percentual de votos para Skank: " + percentualskank + "%");
        System.out.println("Percentual de votos para Jota Quest: " + percentualjotaQuest + "%");
        System.out.println();
        System.out.println("------ GRUPO VENCEDOR ------");
        if (nenhumDeNos > cpm22 && nenhumDeNos > skank && nenhumDeNos > jotaQuest) {
            System.out.println("Nenhum de nós");
        } else if (cpm22 > nenhumDeNos && cpm22 > skank && cpm22 > jotaQuest) {
            System.out.println("CPM22");
        } else if (skank > nenhumDeNos && skank > cpm22 && skank > jotaQuest) {
            System.out.println("Skank");
        } else {
            System.out.println("Jota Quest");
        }
        teclado.close();
    }

}
