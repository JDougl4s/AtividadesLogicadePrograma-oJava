package exercicio_estruturaDeRepeticao;

import java.util.Scanner;

public class uri1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorNumero = 0;
        int conta = 0;
        for (int i = 1 ; i <= 100 ; i++){
            int x = sc.nextInt();
            if (x > maiorNumero) {
                maiorNumero = x;
                conta = i;
            }
        }
        System.out.println(maiorNumero);
        System.out.println(conta);

        sc.close();
    }
}
