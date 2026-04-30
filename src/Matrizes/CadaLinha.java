package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int maiorNumero = 0;
        int[][] mat = new int[5][5];

        System.out.println("Qual a ordem da matriz? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            for (int j = 0; j < qtdRep; j++) {
                System.out.print("Elemento ["+i+","+j+"]:");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
        for (int i = 0; i < qtdRep; i++) {
            for (int j = 0; j < qtdRep; j++) {
                if (mat[i][j] > maiorNumero){
                    maiorNumero = mat[i][j];
                }
            }
            System.out.println(maiorNumero);
        }
    }
}
