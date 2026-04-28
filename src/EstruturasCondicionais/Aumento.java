package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();
        int porcentagem;
        if (salario <= 1000){
            porcentagem = 20;
        }else if(salario > 1000 & salario <= 3000){
            porcentagem = 15;
        } else if (salario > 3000 & salario<= 8000) {
            porcentagem = 10;
        }else {
            porcentagem = 5;
        }

        double aumento = (salario / 100) * porcentagem;
        salario = salario + aumento;
        System.out.println("Novo Salario: " + salario);
        System.out.println("Aumento: " + aumento);
        System.out.println("Porcentagem: " + porcentagem + "%");
    }
}
