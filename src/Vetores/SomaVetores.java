package Vetores;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] vetC = new int[10];

        System.out.println("Quantos valores vai ter cada vetor? ");
        int qtdRep = sc.nextInt();

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < qtdRep; i++) {
            vetA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < qtdRep; i++) {
            vetB[i] = sc.nextInt();
        }
        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < qtdRep; i++) {
            vetC[i] = vetA[i] + vetB[i];
            System.out.println(vetC[i]);
        }
    }
}
