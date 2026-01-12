package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1012 {
    private static Locale locale;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        locale.setDefault(locale.US);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.close();

        double areaTri = (A * C) / 2;
        double areaCirc = 3.14159 * (Math.pow(C,2));
        double areaTrap = (A + B) * C / 2;
        double areaQuad = (Math.pow(B,2));
        double areaRetan = A * B;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
                areaTri, areaCirc, areaTrap, areaQuad, areaRetan);

    }
}
