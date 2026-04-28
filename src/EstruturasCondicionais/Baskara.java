package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

// Formulas
// Delta = b²-4*a*c
// Baskara:
// (-b + RaizQ(Delta)) / (2 * a)
// (-b - RaizQ(Delta)) / (2 * a)
public class Baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Coeficiente a: ");
        double a = sc.nextDouble();

        System.out.println("Coeficiente b: ");
        double b = sc.nextDouble();

        System.out.println("Coeficiente c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(a,2) - 4 * a * c;


        if (delta < 0) {
            System.out.println("Esta equação nao possui raizes reais");
        }else{
            double x1 = ((-b) + Math.sqrt(delta) / (2*a));
            double x2 = ((-b) - Math.sqrt(delta) / (2*a));
            System.out.println("X = " + String.format("%.4f",x1));
            System.out.println("X = " + String.format("%.4f",x2));
        }

    }
}
