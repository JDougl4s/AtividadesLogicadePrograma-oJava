package exercicio_estruturaCondicional;

import java.util.Scanner;

public class uri1046 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int duracao = 0;
        int hInicio = sc.nextInt();
        int hFinal = sc.nextInt();

        if (hInicio > hFinal){
            duracao = 24 - hInicio;
            duracao = duracao + hFinal;
            System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");
        }
        else if (hInicio < hFinal) {
            duracao = hFinal - hInicio;
            System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");
        }
        else if (hInicio == hFinal ){
        System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
