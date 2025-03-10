import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      System.out.println("Número de 3 digitos> ");
      String digitos = valor.next();
      
      int c = 0;
      int d = 1;
      int u = 2;

      char especc = digitos.charAt(c);
      char especd = digitos.charAt(d);
      char especu = digitos.charAt(u);

      System.out.println(especc+" centena(s) "+ especd + " dezena(s) "+ especu + " unidade(s)");

      valor.close();
  } 
}
