package exercicio_estruturaDeRepeticao;

import java.util.Scanner;

public class uri1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int cont = 1 ;
        int resultado = 0;

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < 1; j++){

                resultado = (int) Math.pow(cont, 1);
                System.out.print(resultado +" ");
                resultado = (int) Math.pow(cont, 2);
                System.out.print(resultado +" ");
                resultado = (int) Math.pow(cont, 3);
                System.out.println(resultado);

                resultado = (int) Math.pow(cont, 1);
                System.out.print(resultado +" ");
                resultado = (int) Math.pow(cont, 2);
                System.out.print(resultado + 1 +" ");
                resultado = (int) Math.pow(cont, 3);
                System.out.println(resultado + 1);

            }
            cont++;
        }
        sc.close();
    }
}

