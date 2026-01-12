package exercicios_vetores;

import java.util.Scanner;

public class ATVvetor_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        for (int i = 0 ; i < N ; i++){
            vet[i] = sc.nextInt();
        }

        double soma = 0.0;
        int cont = 0;
        for (int i = 0 ; i < N ; i++){
            if (vet[i] % 2 != 1){
                soma += vet[i];
                cont++;
            }
        }
        double media = soma / cont;
        System.out.println(media);

        sc.close();
    }
}
