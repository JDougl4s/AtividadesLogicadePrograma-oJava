package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ATVvetor_07 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nome = new String[N];
        double[] sem1 = new double[N];
        double[] sem2 = new double[N];

        for (int i = 0 ; i < N ; i++){
            nome[i] = sc.next();
            sem1[i] = sc.nextDouble();
            sem2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        double media = 0;
        for (int i = 0 ; i < N ; i++){
            media = (sem1[i] + sem2[i]) / 2;

            if (media >= 6){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
