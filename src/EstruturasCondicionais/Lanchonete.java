package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigoProd = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int qtdProd = sc.nextInt();

        double valAPagar = 0;
        switch (codigoProd){
            case 1 :
                valAPagar = qtdProd * 5;
                break;
            case 2:
                valAPagar = qtdProd * 3.50;
                break;
            case 3:
                valAPagar = qtdProd * 4.80;
                break;
            case 4:
                valAPagar = qtdProd * 8.90;
                break;
            case 5:
                valAPagar = qtdProd * 7.32;
                break;
            default:
                System.out.println("Valor Invalido!");
        }

        System.out.println("Valor a pagar: R$" + String.format("%.2f", valAPagar));

    }
}
