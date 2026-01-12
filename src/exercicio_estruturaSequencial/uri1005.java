package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1005 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        double A, B, MEDIA;

        A = sc.nextDouble();
        B = sc.nextDouble();
        sc.close();

        MEDIA = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);

    }
}
