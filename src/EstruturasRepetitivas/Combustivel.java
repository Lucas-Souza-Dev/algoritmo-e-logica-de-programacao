package EstruturasRepetitivas;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int combustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (combustivel != 4){
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            combustivel = sc.nextInt();
            switch (combustivel){
                case 1:
                    alcool = alcool + 1;
                    break;
                case 2:
                    gasolina = gasolina + 1;
                    break;
                case 3:
                    diesel = diesel + 1;
                    break;
                case 4:
                    System.out.println("Muito Obrigado");
                    break;
            }
        }
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
