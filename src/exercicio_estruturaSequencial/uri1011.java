package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {
    private static Locale locale;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double volume =  ((double)4/3) * pi * (Math.pow(raio, 3));
        sc.close();

        System.out.printf("VOLUME = %.3f%n", volume);


    }

}
