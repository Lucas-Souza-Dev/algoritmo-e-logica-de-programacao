package Vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int qtdRep = sc.nextInt();
        int[] vet = new int[10];
        for (int i = 0; i < qtdRep; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < qtdRep; i++) {
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }
    }
}
