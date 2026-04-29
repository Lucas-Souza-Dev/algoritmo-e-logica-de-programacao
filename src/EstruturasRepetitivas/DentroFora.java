package EstruturasRepetitivas;

import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int qtdRep = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Digite um numero: ");
            int resp = sc.nextInt();
            if (resp >= 10 & resp<= 20){
                dentro++;
            }else {
                fora++;
            }
        }
        System.out.println(dentro + " Dentro");
        System.out.println(fora + " Fora");
    }
}
