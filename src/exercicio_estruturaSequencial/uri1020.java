package exercicio_estruturaSequencial;

import java.util.Scanner;

public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dias, resto,restoDias, ano, mes;

        dias = sc.nextInt();

        ano = dias / 365 ;
        resto = dias % 365;

        mes = resto / 30 ;
        restoDias = resto % 30;

        sc.close();

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(restoDias + " dia(s)");

    }
}
