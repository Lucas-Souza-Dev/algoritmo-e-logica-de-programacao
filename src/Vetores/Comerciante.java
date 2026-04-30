package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int lucroMenor10 = 0, lucroMaior10 = 0, lucroMaior20 = 0;
        double valTotaCompra = 0, valTotVenda = 0, lucroTotal, porcentagem;

        String[] nome = new String[10];
        double[] precoCompra = new double[10];
        double[] precoVenda = new double[10];

        System.out.println("Serao digitados dados de quantos produtos? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            sc.nextLine();
            System.out.println("Poduto "+(i+1));
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.println("Preco de compra: ");
            precoCompra[i] = sc.nextDouble();

            System.out.println("Preco Venda: ");
            precoVenda[i] = sc.nextDouble();

            valTotaCompra+= precoCompra[i];
            valTotVenda+= precoVenda[i];
        }

        for (int i = 0; i < qtdRep; i++) {
            porcentagem = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]) * 100;

            if (porcentagem < 10){
                lucroMenor10++;
            } else if (porcentagem >= 10 & porcentagem < 20) {
                lucroMenor10++;
            }else {
                lucroMaior20++;
            }
        }
        lucroTotal = valTotVenda - valTotaCompra;

        System.out.println("Lucro abaixo de 10%: "+ lucroMenor10);
        System.out.println("Lucro entre 10% e 20%: "+ lucroMaior10);
        System.out.println("Lucro acima de 20%: " + lucroMaior20);
        System.out.println("Valor total de compra: "+String.format("%.2f",valTotaCompra));
        System.out.println("Valor total de venda: "+String.format("%.2f",valTotVenda));
        System.out.println("Lucro total: "+String.format("%.2f",lucroTotal));

    }
}
