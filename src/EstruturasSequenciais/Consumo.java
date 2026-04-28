package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    // calcular consumo médio de um carro
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distanciaPer = sc.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaPer / combustivelGasto;

        System.out.println("Consumo medio = " + String.format("%.3f", consumoMedio));
    }
}
