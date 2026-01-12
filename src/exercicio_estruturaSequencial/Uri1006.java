package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        double A, B, C, MEDIA;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();

        MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);

    }
}
