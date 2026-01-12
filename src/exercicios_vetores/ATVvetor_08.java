package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ATVvetor_08 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        String[] sexo = new String[N];

         for (int i = 0 ; i < N ; i++){
             altura[i] = sc.nextDouble();
             sexo[i] = sc.next();
         }

         double menor = altura[0];
         for (int i = 0 ; i < N ; i++){
             if( altura[i] <menor){
                 menor = altura[i];
             }
         }
        System.out.printf("Menor altura = %.2f%n", menor);

        double maior = 0.0;
        for (int i = 0 ; i < N ; i++){
            if(altura[i] > maior){
                maior = altura[i];
            }
        }
        System.out.printf("Maior altura = %.2f%n", maior);

        double soma = 0.0;
        int j = 0;
        for (int i = 0 ; i < N ; i++){
            if (sexo[i].equals("F")){
                soma = soma + altura[i];
                j++;
            }
        }
        double media = soma / j;
        System.out.printf("Media das alturas das mulheres = %.2f%n", media);

        int h = 0;
        for (int i = 0 ; i < N ; i++){
            if (sexo[i].equals("M")){
                h++;
            }
        }
        System.out.println("Numero de homens = " + h);

        sc.close();

    }
}
