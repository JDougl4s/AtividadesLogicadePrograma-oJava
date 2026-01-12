package exercicio_estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class uri1010 {

    private static Locale locale;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        int codP1 , codP2, numeroP1, numeroP2;
        double valorP1, valorP2, total;

        codP1 = sc.nextInt();
        numeroP1 = sc.nextInt();
        valorP1 = sc.nextDouble();

        codP2 = sc.nextInt();
        numeroP2 = sc.nextInt();
        valorP2 = sc.nextDouble();
        sc.close();

        total = valorP1 * numeroP1 + valorP2 * numeroP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


    }
}
