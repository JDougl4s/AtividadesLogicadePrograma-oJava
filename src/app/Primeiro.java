package app;
import java.util.Locale;



public class Primeiro {
   private static Locale locale;

   public static void main(String[] args) {

       String produto1 = "Computador";
       String produto2 = "Mesa de Escritorio";

       Integer idade = 30;
       Integer code = 5290;
       char genero = 'F';

       double preco1 = 2100.0;
       double preco2 = 650.50;
       double medida = 53.234567;

       System.out.println("Produtos:");
       System.out.printf("%s, cujo preço é R$ %.2f%n", produto1 , preco1);
       System.out.printf("%s, cujo preço é R$ %.2f%n", produto2 , preco2);
       System.out.println("");

       System.out.printf("Registro: %d anos, código %d e gênero: %c", idade , code , genero);
       System.out.println("");

       System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
       System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);

       locale.setDefault(locale.US);
       System.out.printf("Ponto decimal dos EUA: %.3f%n", medida);


    }
}