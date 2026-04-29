package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = 0;

        while (true) { //x != y
            System.out.println("Digite dois numeros:");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > y){
                System.out.println("DECRESCENTE!");
            }else if(y > x){
                System.out.println("CRESCENTE!");
            }else{
                return;
            }
        }
    }
}
