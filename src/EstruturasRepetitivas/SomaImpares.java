package EstruturasRepetitivas;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros:");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int somaImpares = 0;

        for (int i = inicio; i <= fim - 1; i++){
            if (i % 2 != 0){
                somaImpares += i;
            }
        }
        System.out.println("SOMA DOS IMPARES = " + somaImpares);
    }
}
