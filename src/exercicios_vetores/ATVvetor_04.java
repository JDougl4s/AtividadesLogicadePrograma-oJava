package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ATVvetor_04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for (int i = 0 ; i < N ; i++){
            vet[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0 ; i < N ; i++){
            soma = soma + vet[i];
        }
        double media = soma / N;
        System.out.printf("%.3f%n", media);

        for (int i = 0 ; i < N ; i++){
            if (vet[i] < media){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
