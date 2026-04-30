package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        double totVet = 0;
        int qtdPares = 0;
        double mediaVet;

        System.out.println("Quantos valores vai ter o vetor? ");
        int qtdRep = sc.nextInt();
        for (int i = 0; i < qtdRep; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();

            if (vet[i]%2 == 0){
                totVet+=vet[i];
                qtdPares++;
            }
        }
        mediaVet = totVet / qtdPares;
        if (mediaVet != 0){
            System.out.printf("MEDIA DOS PARES = %.1f",mediaVet);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
