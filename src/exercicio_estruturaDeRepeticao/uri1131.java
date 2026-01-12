package exercicio_estruturaDeRepeticao;

import java.util.Scanner;

public class uri1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int golsGremio = 0;
        int golsInter = 0;
        int digito = 1;
        int cont = 0;
        int empate = 0;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;

        while (digito == 1) {
            golsInter = sc.nextInt();
            golsGremio = sc.nextInt();
            cont += 1;

            if (golsInter == golsGremio){
                empate += 1;
            }
            else if (golsInter > golsGremio) {
                vitoriaInter += 1;
            }
            else{
                vitoriaGremio += 1;

            }


            System.out.println("Novo grenal (1-sim 2-nao)");
            digito = sc.nextInt();
            while (digito != 1 && digito != 2){
                System.out.println("Novo grenal (1-sim 2-nao)");
                digito = sc.nextInt();
            }
        }
        System.out.println(+ cont +" grenais");
        System.out.println("Inter:"+ vitoriaInter);
        System.out.println("Gremio:"+ vitoriaGremio);
        System.out.println("Empates:"+ empate);

        if (vitoriaInter > vitoriaGremio){
            System.out.println("Inter venceu mais");
        }
        else if (vitoriaGremio > vitoriaInter) {
            System.out.println("Gremio venceu mais");
        }
        else if (vitoriaGremio == vitoriaInter){
            System.out.println("Nao houve vencedor");
        }

        sc.close();
    }
}
