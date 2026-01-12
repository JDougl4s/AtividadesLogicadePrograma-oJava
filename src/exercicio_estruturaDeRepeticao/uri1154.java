package exercicio_estruturaDeRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class uri1154 {
    private static Locale locale;
    public static void main(String[] args) {
        Locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int cont = 0;
        int soma = 0;

        while (idade > 0 ){
            soma += idade;
            cont += 1;
            idade = sc.nextInt();
        }
        double media = (double) soma / cont;
        System.out.printf("%.2f%n", media);
        sc.close();
    }
}
