package exercicio_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {
    private static Locale locale;
    public static void main(String[] args){
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);
        double cachoroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;

        int codigo = sc.nextInt();
        int quant = sc.nextInt();

        if (codigo == 1){
            double total = cachoroQuente * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 2) {
            double total = xSalada * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 3) {
            double total = xBacon * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 4) {
            double total = torradaSimples * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 5) {
            double total = refrigerante * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        sc.close();
    }
}
