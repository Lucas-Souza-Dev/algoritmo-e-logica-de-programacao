package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int somaTot = 0;
        int[][] mat = new int[5][5];

        System.out.println("Qual a ordem da matriz? ");
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento ["+i+","+j+"]:");
                mat[i][j] = sc.nextInt();

                if (j > i){
                    somaTot+=mat[i][j];
                }
            }
        }
        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + somaTot);

    }
}
