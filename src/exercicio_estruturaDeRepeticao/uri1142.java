package exercicio_estruturaDeRepeticao;

import java.util.Scanner;

public class uri1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int cont = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(cont + " ");
            cont += 1;
        }
        System.out.println("PUM");
        cont += 1;
    }

    sc.close();
}
}
