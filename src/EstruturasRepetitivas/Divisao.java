package EstruturasRepetitivas;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos casos voce vai digitar? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Entre com o numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Entre com o denominador:");
            int denominador = sc.nextInt();
            if(denominador == 0){
                System.out.println("Divisão Imposivel");
            }else{
                double divisao = (double) numerador / denominador;
                System.out.println("DIVISÃO = " + String.format("%.2f",divisao));
            }
        }
    }
}
