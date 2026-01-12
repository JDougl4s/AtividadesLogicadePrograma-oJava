package exercicio_estruturaDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class uri1116 {
    private static Locale locale;
    public static void main(String[] args) {
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if ( y  == 0 ){
                System.out.println("divisao impossivel");
            }
            else{
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }

        }
        sc.close();
    }
}
