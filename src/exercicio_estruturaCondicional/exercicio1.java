package exercicio_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    private static Locale locale;
    public static void main(String[] args){
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60.00){
            System.out.println("REPROVADO");
        }
        sc.close();

    }
}
