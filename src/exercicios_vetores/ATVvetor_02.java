package exercicios_vetores;

import java.util.Scanner;

public class ATVvetor_02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numeros =  new int[N];

        for (int i = 0; i< N ; i++){
            numeros[i] = sc.nextInt();
        }
        int j = 0;
        int cont = 0;
        for (int i = 0; i< N ; i++){
            if (numeros[i] % 2 != 1){
                cont = numeros[i];
                System.out.print(cont + " ");
                j++;
            }
        }
        System.out.println();
        System.out.println(j);
        sc.close();



    }
}
