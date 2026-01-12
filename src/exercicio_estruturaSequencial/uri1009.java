package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {
    private static Locale locale;
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     locale.setDefault(locale.US);

     String vendedor = sc.next();
     double salario = sc.nextDouble();
     double totalVendas = sc.nextDouble();
     sc.close();

     double comissao = totalVendas * 0.15;
     double totalSalario = salario + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", totalSalario);


    }
}
