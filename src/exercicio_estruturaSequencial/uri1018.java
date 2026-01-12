package exercicio_estruturaSequencial;

import java.util.Scanner;

public class uri1018 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero, resto0, resto1, resto2, resto3, resto4, resto5, cem, cinquenta, vinte, dez, cinco ,dois, um;

        numero = sc.nextInt();

        cem = numero / 100;
        resto0 = numero % 100;

        cinquenta = resto0 / 50;
        resto1 = resto0 % 50;

        vinte = resto1 / 20;
        resto2 = resto1 % 20;

        dez = resto2 / 10;
        resto3 = resto2 % 10;

        cinco = resto3 / 5;
        resto4 = resto3 % 5;

        dois = resto4 / 2;
        resto5 = resto4 % 2;

        um = resto5 / 1;

        sc.close();

        System.out.println(numero);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }
}
