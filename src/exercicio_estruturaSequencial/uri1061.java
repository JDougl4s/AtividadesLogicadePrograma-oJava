package exercicio_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1061 {
    private static Locale locale;
    public static void main(String[] args){
        locale.setDefault(locale.US);
        Scanner sc = new Scanner(System.in);

        //COMEÇO DA FESTA
        String linha1 = sc.next();
        int diaC = sc.nextInt();
        int horaC = sc.nextInt();
        String pontos1 = sc.next();
        int minutoC = sc.nextInt();
        String pontos2 = sc.next();
        int segundoC = sc.nextInt();

        //FIM DA FESTA
        String linha2 = sc.next();
        int diaF = sc.nextInt();
        int horaF = sc.nextInt();
        String pontos3 = sc.next();
        int minutoF = sc.nextInt();
        String pontos4 = sc.next();
        int segundoF = sc.nextInt();

        sc.close();

        int segundoDIAS = (diaC - diaF) *  86400 ;
        int segundoHORAS = (horaC - horaF) * 3600;
        int segundoMINUTOS = (minutoC - minutoF) * 60 ;
        int tempoTotal = (segundoC - segundoF) + segundoDIAS + segundoHORAS+ segundoMINUTOS ;
        int valor = 0 ;

        valor = tempoTotal / 86400 ;
        System.out.println(Math.abs(valor) + " dia(s)");
        tempoTotal = tempoTotal % 86400 ;

        valor = tempoTotal / 3600 ;
        System.out.println(Math.abs(valor) + " hora(s)");
        tempoTotal = tempoTotal % 3600 ;

        valor = tempoTotal / 60 ;
        System.out.println(Math.abs(valor) + " minuto(s)");
        tempoTotal = tempoTotal % 60 ;

        valor = tempoTotal ;
        System.out.println(Math.abs(valor) + " segundo(s)");

    }
}
