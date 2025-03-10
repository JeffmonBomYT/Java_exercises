import java.util.Scanner;

public class Uni3Exe10 {

  public static void main(String[] args) {
      //hipotenusa² = cateto1² + cateto2²
      Scanner valor = new Scanner(System.in);
      System.out.println("Calculadora do comprimento da hipotenusa");
      System.out.println("Cateto oposto> ");
      double cateto1 = valor.nextDouble();
      System.out.println("Cateto adjacente> ");
      double cateto2 = valor.nextDouble();
      double cateto_opt = /*Math.pow(cateto1, 2)*/cateto1 * cateto1;
      double cateto_adj = /*Math.pow(cateto2, 2)*/cateto2 * cateto2;
      double soma_cat = cateto_opt + cateto_adj;
      double hipo = Math.sqrt(soma_cat);
      System.out.println(hipo);
      valor.close();
  }
}