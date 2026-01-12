package exercicios_matrizes;

import java.util.Scanner;

public class atv_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matA = new int[M][N];
        int[][] matB = new int[M][N];
        int[][] matC = new int[M][N];

        //adicionando valores a MATRIZ A
        for (int i =0 ; i<M ; i++){
            for (int j =0 ; j<N ; j++){
                matA[i][j] = sc.nextInt();
            }
        }

        //adicionando valores a MATRIZ B
        for (int i =0 ; i<M ; i++){
            for (int j =0 ; j<N ; j++){
                matB[i][j] = sc.nextInt();
            }
        }

        //adicionando valores a MATRIZ C
        for (int i =0 ; i<M ; i++){
            for (int j =0 ; j<N ; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        //print da MATRIZ C
        for (int i =0 ; i<M ; i++){
            for (int j =0 ; j<N ; j++){
                    System.out.print(matC[i][j] + " ");
                }
            System.out.println();
            }
        }
    }

