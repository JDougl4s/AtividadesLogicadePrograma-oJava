package exercicio_estruturaDeRepeticao;

import java.util.Scanner;

public class uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();


        while(m > 0 && n > 0){
            int maior = m;
            int menor = n;

            if (m < n ){
                maior = n;
                menor = m;
            }
                int sum = 0;
                for( int i = menor ; i <= maior ; i++){
                    sum = sum + i;
                    System.out.print(i + " ");

                }
                System.out.println("Sum="+ sum);
                m = sc.nextInt();
                n = sc.nextInt();
            }
        sc.close();
    }
}

