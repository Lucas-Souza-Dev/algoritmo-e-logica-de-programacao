package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        System.out.print("Digite a senha: ");
        int tentativa = sc.nextInt();
        while(tentativa != senha){
            System.out.print("Senha Invalida! Tente novamente: ");
            tentativa = sc.nextInt();
        }
        if (tentativa == senha){
            System.out.println("Acesso permitido!");
        }

    }
}
