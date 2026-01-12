package exercicio_estruturaDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class uri1079 {
    private static Locale locale;
    public static void main(String[] args) {
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            float v1 = sc.nextFloat();
            float v2 = sc.nextFloat();
            float v3 = sc.nextFloat();

            float media = (v1*2 + v2*3 + v3*5) / (2+3+5);
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
