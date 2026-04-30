package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[10];
        double totalVet = 0;

        System.out.println("Quantos valores vai ter o vetor? ");
        int qtdRep = sc.nextInt();
        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();

            totalVet += vet[i];
        }

        double media = totalVet/qtdRep;
        System.out.println("MEDIA DO VETOR ="+String.format("%.3f",media));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < qtdRep; i++) {
            if (vet[i]<media){
                System.out.println(vet[i]);
            }
        }
    }
}
