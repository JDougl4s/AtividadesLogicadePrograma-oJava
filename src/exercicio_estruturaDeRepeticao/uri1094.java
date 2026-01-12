package exercicio_estruturaDeRepeticao;

import java.util.Scanner;
import java.util.Locale;


public class uri1094 {
    private static Locale locale;
    public static void main(String[] args) {
        locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, n, totalCobaias = 0, totalCoelhos = 0 , totalRatos = 0 , totalSapos = 0;
        double percentualRatos = 0, percentualSapos = 0 , percentualCoelhos = 0;
        String animal;

        n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            x = sc.nextInt();
            animal = sc.next();
            totalCobaias = totalCobaias + x;

            //.equals() verifica se os dados dentro dos objetos são os mesmos.
            if (animal.equals("C")){
                totalCoelhos += x;
            }
            else if (animal.equals("R")) {
                totalRatos += x;
            }
            else if (animal.equals("S")) {
                totalSapos += x;
            }
            percentualRatos = (double)(totalRatos * 100)/totalCobaias;
            percentualSapos = (double)(totalSapos * 100)/totalCobaias;
            percentualCoelhos = (double)(totalCoelhos * 100)/totalCobaias;

        }
        System.out.printf("Total: %d cobaias%n", totalCobaias);
        System.out.printf("Total de coelhos: %d%n", totalCoelhos);
        System.out.printf("Total de ratos: %d%n", totalRatos);
        System.out.printf("Total de sapos: %d%n", totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

        sc.close();
    }
}
