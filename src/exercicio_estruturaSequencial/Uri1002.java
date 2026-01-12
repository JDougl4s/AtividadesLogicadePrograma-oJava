package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        double pi, raio, area;
        pi = 3.14159;
        raio = sc.nextDouble();
        sc.close();

        area = pi * (Math.pow(raio, 2));
        System.out.printf("A=%.4f%n", area);

    }
}
