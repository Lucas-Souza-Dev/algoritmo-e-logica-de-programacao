package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double cumprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valMetroQuad = sc.nextDouble();


        double areaTerreno = largura * cumprimento;
        double valTotal = valMetroQuad * areaTerreno;

        System.out.println("Area do terreno = " + String.format("%.2f",areaTerreno));
        System.out.println("Preco do Terreno = R$" + String.format("%.2f",valTotal));
    }
}
