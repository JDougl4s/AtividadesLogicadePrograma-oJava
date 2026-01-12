package exercicio_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class uri1048 {
    private static Locale locale;
    public static void main(String[] args){
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);
        double aumento;
        double novoSalario;
        double salario = sc.nextDouble();

        if (salario > 0 && salario <= 400.00){
            aumento = salario * 0.15;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 15 %");
        }
        else if (salario > 400 && salario <= 800.00) {
            aumento = salario * 0.12;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 12 %");
        }
        else if (salario > 800 && salario <= 1200.00) {
            aumento = salario * 0.10;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 10 %");
        }
        else if (salario > 1200 && salario <= 2000.00) {
            aumento = salario * 0.07;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 7 %");
        }
        else if (salario > 2000) {
            aumento = salario * 0.04;
            novoSalario = salario + aumento;
            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",aumento);
            System.out.println("Em percentual: 4 %");
        }
        sc.close();
    }
}
