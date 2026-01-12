package exercicio_estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;
public class uri1008 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);
        int numeroF, horasT;
        double valorPR, salario;

        numeroF = sc.nextInt();
        horasT = sc.nextInt();
        valorPR = sc.nextDouble();
        sc.close();

        salario = (double) horasT * valorPR;
        System.out.println("NUMBER = " + numeroF);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
