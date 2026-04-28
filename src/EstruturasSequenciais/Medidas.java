package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double medA = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        double medB = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        double medC = sc.nextDouble();

        double areaQuad = Math.pow(medA,2);
        double areaTri = (medA * medB) / 2;
        double areaTra = ((medA + medB) * medC) / 2;

        System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQuad));
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTri));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTra));

    }
}
