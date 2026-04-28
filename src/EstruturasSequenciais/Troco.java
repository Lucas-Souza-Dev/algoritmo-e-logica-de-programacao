package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

//Solicitar qtd de produtos e valor unitario
// solicitar o valor e calcular o troco
public class Troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Preço unitário do produto: ");
        double precoProd = sc.nextDouble();

        System.out.println("Quantidade comprada:");
        int qtdComprada = sc.nextInt();

        System.out.println("Dinheiro recebido: ");
        double dinReceb = sc.nextDouble();

        double troco = dinReceb - (qtdComprada * precoProd);

        System.out.println("Troco : " + String.format("%.2f", troco));
    }
}
