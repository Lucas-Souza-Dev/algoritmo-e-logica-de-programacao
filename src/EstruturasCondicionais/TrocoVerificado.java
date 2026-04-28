package EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço unitário do produto: ");
        double precoUni = sc.nextDouble();

        System.out.println("Quantidade comprada: ");
        int qtdComp = sc.nextInt();

        System.out.println("Dinheiro recebido: ");
        double dinReceb = sc.nextDouble();

        double valTotal = qtdComp * precoUni;
        if (dinReceb > valTotal){
            double troco = valTotal - dinReceb;
            System.out.println("TROCO = " + String.format("%.2f", troco));
        }else {
            double faltante = dinReceb - valTotal;
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f",Math.abs(faltante)) + " Reais");
        }
    }
}
