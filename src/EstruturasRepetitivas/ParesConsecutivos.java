package EstruturasRepetitivas;

import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, soma;

        System.out.println("Digite um numero inteiro: ");
        numero = sc.nextInt();

        while (numero != 0){
            if(numero % 2 !=0){
             // impar
             numero ++;
            }
            soma = 5 * numero + 20;
            System.out.printf("SOMA = %d\n", soma);

            System.out.println("Digite um numero inteiro: ");
            numero = sc.nextInt();
        }
        sc.close();
    }
}
