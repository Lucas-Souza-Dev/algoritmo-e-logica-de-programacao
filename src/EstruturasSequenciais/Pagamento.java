package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
            String nome = sc.nextLine();
        System.out.print("Valor por hora: ");
            double valHora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
            int horaTrab = sc.nextInt();

        double salario = valHora * horaTrab;

        System.out.println("O pagamento para "+ nome + " deve ser R$" + String.format("%.2f", salario));
    }
}
