package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 % num2 == 0){
            System.out.println("São Multiplos");
        }else if (num2 % num1 == 0){
            System.out.println("São Multiplos");
        }else{
            System.out.println("Não são multiplos");
        }
    }
}
