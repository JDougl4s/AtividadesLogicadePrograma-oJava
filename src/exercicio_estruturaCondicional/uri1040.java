package exercicio_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class uri1040 {
    private static Locale locale;

    public static void main(String[] args) {
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 , n2 , n3 , n4;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        }

        else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }

        else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            float nota = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", nota);
            float novaMedia = (nota + media) / 2;

            if (novaMedia >= 5.0){
                    System.out.println("Aluno aprovado.");
                } else if (novaMedia <= 4.9) {
                    System.out.println("Aluno reprovado.");
                }
            System.out.printf("Media final: %.1f%n", novaMedia);
        }
        sc.close();
    }
}
