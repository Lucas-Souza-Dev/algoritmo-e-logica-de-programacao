package EstruturasRepetitivas;

import java.util.Scanner;

public class SequenciaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        if (x % 2 == 0){
            x--;
        }
        for (int i = 1; i <= x; i+=2) {
            System.out.println(i);
        }
    }
}
