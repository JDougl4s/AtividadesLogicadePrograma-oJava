package exercicio_estruturaSequencial;

import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, DIFERENCA;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        sc.close();
        DIFERENCA =  (a * b - c * d);
        System.out.println("DIFERENCA = " +DIFERENCA);

    }
}
