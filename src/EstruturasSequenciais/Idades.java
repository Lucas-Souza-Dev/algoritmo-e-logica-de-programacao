package EstruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

/*
Ler o nome e idade de duas pessoas
mostrar os nomes e a idade média

 */
public class Idades {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        double idadeMedia = (double) (idade + idade2) / 2;

        System.out.println("A idade média de " + nome + " e " + nome2 + "é de "+String.format("%.1f",idadeMedia));

        sc.close();
    }
}
