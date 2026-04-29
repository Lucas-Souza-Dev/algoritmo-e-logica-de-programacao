package EstruturasRepetitivas;

import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cobaias = 0;
        int totCobaias = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        double prctCoelhos, prctRatos, prctSapos;

        System.out.println("Quantos casos de teste serao digitados? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            System.out.println("Quantidade de cobaias: ");
            cobaias = sc.nextInt();
            sc.nextLine();
            System.out.println("Tipo de cobaia: ");
            String tipoCobaia = sc.nextLine().toLowerCase();
            if (tipoCobaia.equals("c")){
                coelhos+=cobaias;
            } else if (tipoCobaia.equals("r")) {
                ratos+=cobaias;
            } else if (tipoCobaia.equals("s")) {
                sapos+=cobaias;
            }
            totCobaias+=cobaias;
        }
        prctCoelhos = ((double) coelhos / totCobaias) * 100;
        prctRatos = ((double) ratos / totCobaias) * 100;
        prctSapos = ((double) sapos / totCobaias) * 100;

        System.out.println("RELATORIO FINAL:");
        System.out.println("Total: " + totCobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.println("Percentual de Coelhos: " + String.format("%.2f", prctCoelhos));
        System.out.println("Percentual de Ratos: " + String.format("%.2f", prctRatos));
        System.out.println("Percentual de Sapos: " + String.format("%.2f", prctSapos));

    }
}
