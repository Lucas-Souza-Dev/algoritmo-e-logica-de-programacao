package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] altura = new double[10];
        String[] genero = new String[10];

        double menorAltura = 10;
        double maiorAltura = 0;
        double somaAltF = 0;
        int contadorM = 0;
        int contadorF = 0;

        System.out.println("Quantas pessoas serao digitadas? ");
        int qtdRep = sc.nextInt();
        for (int i = 0; i < qtdRep; i++) {
            System.out.print("Altura da "+(i+1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da "+(i+1) + "a pessoa: ");
            genero[i] = sc.next().toUpperCase();

            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if (genero[i].equals("F")){
                somaAltF += altura[i];
                contadorF++;
            }else{
                contadorM++;
            }
        }
        double mediaAltF = somaAltF / contadorF;

        System.out.println("Menor altura = "+ String.format("%.2f",menorAltura));
        System.out.println("Maior altura = "+ String.format("%.2f",maiorAltura));
        System.out.println("Media das alturas das mulheres = "+ String.format("%.2f",mediaAltF));
        System.out.println("Numero de homens = "+ contadorM);
    }
}
