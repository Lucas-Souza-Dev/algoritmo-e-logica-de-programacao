package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida da glicose: ");
        double glicose = sc.nextDouble();

        if (glicose <= 90){
            System.out.println("Classificacao: normal");
        }else if(glicose<=140){
            System.out.println("Classificacao: elevado");
        }else {
            System.out.println("Classificacao: diabetes");
        }
    }
}
