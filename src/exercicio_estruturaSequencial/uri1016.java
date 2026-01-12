package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1016 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y, calculo;

        y = sc.nextInt();
        sc.close();

        calculo = y * 2;

        System.out.println(+ calculo +" minutos");
    }
}
