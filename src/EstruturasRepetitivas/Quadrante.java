package EstruturasRepetitivas;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = 1;
        boolean validation = true;


        while(validation){
            System.out.println("Digite os valores das coordenadas X e Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
            if((x== 0) || (y == 0)){
                validation = false;
            } else if (x > 0 & y > 0) {
                System.out.println("QUADRANTE Q1 ");
            }else if (x < 0 & y > 0) {
                System.out.println("QUADRANTE Q2 ");
            }else if (x < 0 & y < 0) {
                System.out.println("QUADRANTE Q3 ");
            }else {
                System.out.println("QUADRANTE Q4 ");
            }
        }
    }
}
