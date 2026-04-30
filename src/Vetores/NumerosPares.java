package Vetores;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int qtdRep = sc.nextInt();
        int[] vetor = new int[10];

        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        int qtdPares = 0;
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < qtdRep; i++) {
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
                qtdPares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);
    }
}
