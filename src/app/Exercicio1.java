package app;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
    //criando objeto scanner
    Scanner sc = new Scanner(System.in);

    //definido tipo das variaveis
    double largura, comprimento, mQuadrado, area, preco;

    //recebendo a entrada de dado do usuario
    largura = sc.nextDouble();
    comprimento = sc.nextDouble();
    mQuadrado = sc.nextDouble();
    sc.close();

    //calculos
    area = largura * comprimento;
    preco = area * mQuadrado;

    //mostrar os valores do usuario
    System.out.printf("AREA: %.2f%n", area);
    System.out.printf("PRECO: %.2f%n", preco);
    }
}
