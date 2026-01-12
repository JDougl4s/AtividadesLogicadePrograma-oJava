package exercicios_matrizes;

import java.util.Scanner;

public class atv_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                mat [i][j] = sc.nextInt();
            }
        }
        int soma = 0;
        for (int i=0 ; i<N ; i++){
            soma = soma + mat[i][i];
        }
        System.out.println(soma);

    }
}
