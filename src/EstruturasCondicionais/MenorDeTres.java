package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.println("Segundo valor: ");
        int num2 = sc.nextInt();

        System.out.println("Terceiro valor: ");
        int num3 = sc.nextInt();

        if (num1 <= num2 & num1 <= num3){
            System.out.println("Menor: " + num1);
        }else if (num2 <= num1 & num2 <= num3){
            System.out.println("Menor: " + num2);
        }else{
            System.out.println("Menor: "+ num3);
        }
    }
}
