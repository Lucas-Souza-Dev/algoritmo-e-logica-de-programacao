package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[10];
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];

        System.out.println("Quantos alunos serao digitados? ");
        int qtdRep = sc.nextInt();

        for (int i = 0; i < qtdRep; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < qtdRep; i++) {
            double media = (nota1[i] + nota2[i]) / qtdRep;
            if (media > 6.0){
                System.out.println(nome[i]);
            }
        }
    }
}
