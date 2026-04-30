package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[10];
        int[] idade = new int[10];
        int maiorIdade = 0;
        int indiceMaior = 0;

        System.out.print("Quantas pessoas voce vai digitar? ");
        int qtdRep = sc.nextInt();
        for (int i = 0; i < qtdRep; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            if (idade[i]>maiorIdade){
                maiorIdade = idade[i];
                indiceMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nome[indiceMaior]);

    }
}
