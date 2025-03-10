import java.util.Scanner;

public class Uni3Exe08 {
  public static void main(String[] args) {
    System.out.println("Posto de Cânbio");
    Scanner valor = new Scanner(System.in);
    double swap = valor.nextInt();
    double cambio = swap * 5.83;
    System.out.println("Dólar -> Real ");
    System.out.println("U$ 5,83 -> R$ 1,00");
    System.out.println(valor);
    System.out.println(cambio);
    valor.close();
      
  }
}
