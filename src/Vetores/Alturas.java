package Vetores;

import java.util.Locale;
import java.util.Scanner;


public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[10];
        int[] idade = new int[10];
        double[] altura = new double[10];
        int contadorMenor = 0;
        double totalAltura = 0;

        System.out.println("Quantas pessoas serao digitadas? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a Pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();

        }
        for (int i = 0; i < qtdRep; i++) {
            if (idade[i]<16){
                contadorMenor++;
            }
            totalAltura+=altura[i];
        }
        double alturaMedia = totalAltura / qtdRep;
        double prctMenor = ((double)contadorMenor / qtdRep)* 100;

        System.out.printf("Altura média: %.2f", alturaMedia);
        System.out.println();
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f",prctMenor) + "%");

        for (int i = 0; i < qtdRep; i++) {
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

    }
}
