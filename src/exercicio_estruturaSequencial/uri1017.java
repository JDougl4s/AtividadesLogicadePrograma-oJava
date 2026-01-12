package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        int t, vm;
        double distancia, combustivel;

        t = sc.nextInt();
        vm = sc.nextInt();
        sc.close();

        distancia = t * vm;
        combustivel = distancia / 12;

        System.out.printf("%.3f%n", combustivel);
    }
}
