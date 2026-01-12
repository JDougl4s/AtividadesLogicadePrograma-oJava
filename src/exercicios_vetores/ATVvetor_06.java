package exercicios_vetores;

import java.util.Scanner;

public class ATVvetor_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nome = new String[N];
        int[] idade = new int[N];

        for (int i = 0 ; i < N ; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
        }

        int cont = 0;
        String contNomes = "";
        for (int i = 0 ; i < N ; i++){
            if (idade[i] > cont){
                cont = idade[i];
                contNomes = nome[i];
            }
        }
        System.out.println(contNomes);

        sc.close();
    }
}
