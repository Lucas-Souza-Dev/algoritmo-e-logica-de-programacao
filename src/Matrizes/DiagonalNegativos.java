package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdNegativos = 0;
        int[][] mat = new int[5][5];

        System.out.println("Qual a ordem da matriz? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            for (int j = 0; j < qtdRep; j++) {
                System.out.print("Elemento ["+i+","+j+"]:");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < qtdRep; i++) {
            for (int j = 0; j < qtdRep; j++) {
                if (i==j){
                    System.out.print(mat[i][j] + " ");
                }
                if (mat[i][j] < 0){
                    qtdNegativos++;
                }
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE NEGATIVOS = " + qtdNegativos);
    }
}
