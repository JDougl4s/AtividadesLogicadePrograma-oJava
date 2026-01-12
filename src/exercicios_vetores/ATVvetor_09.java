package exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ATVvetor_09 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] produtos = new String[N];
        double[] compra = new double[N];
        double[] venda = new double[N];

        for (int i = 0 ; i < N ; i++){
            produtos[i] = sc.next();
            compra[i] = sc.nextDouble();
            venda[i] = sc.nextDouble();
        }
        double lucro = 0;
        double lucroPercentual = 0.0;
        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0 ; i < N ; i++){
            lucro = venda[i] - compra[i];
            lucroPercentual = lucro / compra[i];

            if ( lucroPercentual < 0.1){
                cont0++;
            }
            else if (lucroPercentual >= 0.1  && lucroPercentual <= 0.2) {
                cont1++;
            }
            else if (lucroPercentual > 0.2) {
                cont2++;
            }
        }
        System.out.println("Lucro abaixo de 10%: "+ cont0);
        System.out.println("Lucro entre 10% e 20%: "+ cont1);
        System.out.println("Lucro acima de 20%: "+ cont2);

        double somaCompra = 0.0;

        for (int i = 0 ; i < N ; i++){
            somaCompra = somaCompra + compra[i];
        }
        System.out.printf("Valor total de compra: %.2f%n", somaCompra);

        double somaVenda = 0.0;

        for (int i = 0 ; i < N ; i++){
            somaVenda = somaVenda + venda[i];
        }
        System.out.printf("Valor total de venda: %.2f%n", somaVenda);

        double lucroTotal = somaCompra - somaVenda;
        System.out.printf("Lucro total: %.2f%n", (Math.abs(lucroTotal)));

        sc.close();
    }
}
