package exercicio_estruturaDeRepeticao;

import java.util.Scanner;

public class uri1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;
        int cf = 0;
        int cd = 0;
        for (int i = 0 ; i < n ; i++){
            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                cd = cd + 1;
            }
            else{
                cf = cf + 1;
            }

        }
        System.out.println(cd +" in");
        System.out.println(cf +" out");
        sc.close();
    }
}
