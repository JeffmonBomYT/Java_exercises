import java.util.Scanner;

public class Uni3Exe07 {

  public static void main(String[] args) {
      System.out.println("Distribuidora de refrigerante");
        Scanner quant = new Scanner(System.in);
        double menor = 0.35;
        double medio = 0.6;
        int grande = 2;
        System.out.println("Quantidade de 350ml > ");
        int lata = quant.nextInt();
        System.out.println("Quantidade de 600ml > ");
        int garrafa = quant.nextInt();
        System.out.println("Quantidade de 2L > ");
        int litrao = quant.nextInt();
        double pp = menor * lata;
        double mm = medio * garrafa;
        double gg = grande * litrao;
        double soma = pp + mm + gg;
        System.out.println("A quantidade total de litros vendidos foi de "+ soma);
        quant.close();
    }
    
  }