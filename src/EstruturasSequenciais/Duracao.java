package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a duracao em segundos: ");
        int duracao = sc.nextInt();

        int horas = duracao / 3600;
        int resto = duracao % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }

}
