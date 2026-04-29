package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as idades:");
        int contador = 0;
        int somaIdades = 0;
        int idades = sc.nextInt();
        if (idades < 0){
            System.out.println("Impossivel Calcular");
        }else {
            while (idades > 0){
               idades = sc.nextInt();
               if (idades > 0){
                   somaIdades = somaIdades + idades;
                   contador = contador + 1;
               }
            }
            double media = (double) somaIdades / contador;
            System.out.println("MEDIA = " + String.format("%.2f",media));
        }




    }
}
