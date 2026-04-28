package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int qtdMin = sc.nextInt();

        if (qtdMin > 100){
            qtdMin = qtdMin - 100;
            double result = qtdMin * 2;
            System.out.println("Valor a Pagar: R$" + String.format("%.2f", result + 50) );
        }else{
            System.out.println("Valor a Pagar: R$" + String.format("%.2f", 50.00));
        }
    }
}
