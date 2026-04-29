package EstruturasRepetitivas;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int numTab = sc.nextInt();
        int soma;

        for (int i = 1; i <= 10; i++){
            System.out.println(i + "x" + numTab + " = "+ i*numTab);
        }

    }
}
