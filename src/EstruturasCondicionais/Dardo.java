package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double tentativa1 = sc.nextDouble();
        double tentativa2 = sc.nextDouble();
        double tentativa3 = sc.nextDouble();

        if (tentativa1 > tentativa2 & tentativa1 > tentativa3){
            System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", tentativa1));
        } else if (tentativa2 > tentativa1 & tentativa2 > tentativa3) {
            System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", tentativa2));
        }else{
            System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", tentativa3));
        }
    }
}
