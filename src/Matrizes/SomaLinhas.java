package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[][] mat = new double[10][10];
        double[]vet = new double[10];

        System.out.println("Qual a quantidade de linhas da matriz? ");
        int M = sc.nextInt();

        System.out.println("Qual a quantidade de colunas da matriz? ");
        int N = sc.nextInt();

        for (int i = 0; i < M; i++) {
            System.out.println("Digite os elementos da "+(i+1)+"a. linha: ");
            double somaVal = 0;
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextDouble();
                somaVal+= mat[i][j];
            }
            vet[i] = somaVal;
            somaVal = 0;
        }

        System.out.println("VETOR GERADO: ");
        for (int i = 0; i < M; i++) {
            System.out.println(vet[i]);
        }
    }
}
