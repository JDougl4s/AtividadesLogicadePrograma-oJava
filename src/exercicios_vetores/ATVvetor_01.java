package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ATVvetor_01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] numeros = new double[N];

        for (int i = 0; i< N ; i++){
            numeros[i] = sc.nextDouble();
        }
        double cont = 0;
        int j = 0;
        for (int i = 0; i< N ; i++){
            if (numeros[i] > cont){
                cont = numeros[i];
                j ++;
            }
        }

        System.out.println(cont);
        System.out.println(j);
        sc.close();

    }
}
