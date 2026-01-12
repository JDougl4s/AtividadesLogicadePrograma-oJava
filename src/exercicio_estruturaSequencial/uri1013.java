package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1013 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorAnterioC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(+ maiorAnterioC+ " eh o maior");
    }
}
