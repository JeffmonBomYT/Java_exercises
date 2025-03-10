
import java.util.Scanner;

public class Uni3Exe11 {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      System.out.println("Conversor de Cº -> Fº");
      System.out.println("Valor em Cº (celsius)");
      double celsius = valor.nextDouble();
      double conv = (celsius * 9 / 5) + 32;
      System.out.println("O valor da conversão foi de "+ celsius +" para "+ conv);
      valor.close();
  }
}
