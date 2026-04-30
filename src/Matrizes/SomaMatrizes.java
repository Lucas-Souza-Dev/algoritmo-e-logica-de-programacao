package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] matA = new int[10][10];
        int[][] matB = new int[10][10];


        System.out.println("Qual a quantidade de linhas da matriz? ");
        int M = sc.nextInt();

        System.out.println("Qual a quantidade de colunas da matriz? ");
        int N = sc.nextInt();

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento ["+i+","+j+"]:");
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento ["+i+","+j+"]:");
                matB[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matA[i][j] + matB[i][j] + " ");
            }
            System.out.println();
        }

    }
}