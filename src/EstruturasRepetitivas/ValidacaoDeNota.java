package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        boolean validaN1 = true;
        while (validaN1){
            if (nota1 <= 0 & nota1 > 10){
                System.out.println("Valor invalido! Tente novamente: ");
                nota1 = sc.nextDouble();
            }else{
                validaN1 = false;
            }
        }
        System.out.println("Digite a Segunda nota:");
        double nota2 = sc.nextDouble();
        boolean validaN2 = true;
        while (validaN2){
            if (nota1 <= 0 & nota1 > 10){
                System.out.println("Valor invalido! Tente novamente: ");
                nota1 = sc.nextDouble();
            }else{
                validaN2 = false;
            }
        }
        double media = (nota1 + nota2) / 2;
        System.out.println("MEDIA = " + String.format("%.2f",media));

    }
}
