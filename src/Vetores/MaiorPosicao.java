package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[]  vet = new double[10];
        double maiorValor = 0;
        int indice = 0;

        System.out.println("Quanto numeros voce vai digitar? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();

            if (maiorValor < vet[i]){
                maiorValor = vet[i];
                indice = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + indice);
    }
}
