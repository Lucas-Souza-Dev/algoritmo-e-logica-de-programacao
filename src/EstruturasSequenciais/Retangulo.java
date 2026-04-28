package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        double calcArea, calcPerimetro, calcDiagonal;

        calcArea = base * altura;
        calcPerimetro = (base + altura) * 2;
        double x = Math.pow(base, 2) + Math.pow(altura, 2);
        calcDiagonal = Math.sqrt(x);

        System.out.println("Area: " + String.format("%.4f" , calcArea));
        System.out.println("Perimetro: " + String.format("%.4f" , calcPerimetro));
        System.out.println("Diagonal: " + String.format("%.4f" , calcDiagonal));
    }
}
