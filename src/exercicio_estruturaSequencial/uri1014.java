package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {
    private static Locale locale;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        int x;
        double y, media;

        x = sc.nextInt();
        y = sc.nextDouble();
        sc.close();
        media = x / y ;

        System.out.printf("%.3f km/l", media);
    }
}
