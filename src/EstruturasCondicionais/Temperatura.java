package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
        String tipoTemp = sc.nextLine();
        tipoTemp = tipoTemp.toUpperCase();
        if (tipoTemp.equals("F")){
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double temperatura = sc.nextDouble();
            double celsius = ((temperatura - 32)*5)/9;
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", celsius));

        }else if (tipoTemp.equals("C")){
            System.out.println("Digite a temperatura em Celsius: ");
            double temperatura = sc.nextDouble();
            double fahrenheit = temperatura * 1.8 + 32;
            System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", fahrenheit));
        }else {
            System.out.println("Valor Invalido");
        }
    }
}
