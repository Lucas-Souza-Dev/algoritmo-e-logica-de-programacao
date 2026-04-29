package EstruturasRepetitivas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int qtdRep = sc.nextInt();
        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            if(num == 0){
                System.out.println("NULO");
            }else if (num < 0 & num % 2 == 0){
                System.out.println("PAR NEGATIVO");
            } else if (num > 0 & num % 2 == 0) {
                System.out.println("PAR POSITIVO");
            } else if (num < 0 & num % 2 != 0) {
                System.out.println("IMPAR NEGATIVO");
            }else {
                System.out.println("IMPAR POSITIVO");
            }
        }
    }
}
