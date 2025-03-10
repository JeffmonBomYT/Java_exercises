
import java.util.Scanner;

public class Uni3Exe13 {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      System.out.println("Altura> ");
      double altura = valor.nextDouble();
      System.out.println("Comprimento> ");
      double comprimento = valor.nextDouble();

      double azu_meter = 12.50 * 9; // R$112,5 por m²

      double metro2 = altura * comprimento;
      double total = metro2 * azu_meter;
      System.out.println(total);

      valor.close();
  }
}
