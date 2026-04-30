package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[][] mat = new double[5][5];
        double somaTot = 0;

        System.out.print("Qual a ordem da matriz? ");
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento ["+i+","+j+"]:");
                mat[i][j] = sc.nextInt();

                if (mat[i][j] >= 0){
                    somaTot+=mat[i][j];
                }
            }
        }
        System.out.println("SOMA DOS POSITIVOS: " + somaTot);
        System.out.println();

        System.out.println("Escolha uma linha: ");
        int linha = sc.nextInt();
        for (int i = 0; i < M; i++) {
            System.out.print(mat[linha][i]+ " ");
        }
        System.out.println();

        System.out.println("Escolha uma linha: ");
        int coluna = sc.nextInt();
        for (int i = 0; i < M; i++) {
            System.out.print(mat[i][coluna]+ " ");
        }
        System.out.println();

        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("MATRIZ ALTERADA: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                double elevado;
                if (mat[i][j] < 0){
                    mat[i][j] = Math.pow(mat[i][j],2);
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
