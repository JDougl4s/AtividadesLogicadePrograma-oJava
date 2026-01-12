package exercicios_matrizes;

import java.util.Scanner;

public class atv_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for (int i=0 ; i<N ; i++){
            for (int j=0 ; j<N ; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i<N ; i++){
            int cont = 0;
            for (int j=0 ; j<N ; j++){
               if(mat[i][j] > cont ){
                   cont = mat[i][j];
               }
            }
            System.out.println(cont);
        }

    }
}
