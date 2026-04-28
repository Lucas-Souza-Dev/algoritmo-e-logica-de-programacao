package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaIni = sc.nextInt();
        System.out.print("Hora final: ");
        int horaFim = sc.nextInt();

        int retorno;
        if (horaIni < horaFim){
            retorno = horaIni + horaFim;
        }else {
           retorno = 24 - horaIni + horaFim;
        }

        System.out.println("O JOGO DUROU " + retorno + " HORA(s)");

    }
}
