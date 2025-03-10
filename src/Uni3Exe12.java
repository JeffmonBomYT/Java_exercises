
import java.util.Scanner;

public class Uni3Exe12 {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      System.out.println("Nome> ");
      String nome = valor.next();
      System.out.println("Horas de serviço/mês> ");
      int horas = valor.nextInt();
      System.out.println("Números de dependentes> ");
      int/*byte*/ depends = /*valor.nextByte();*/valor.nextInt();

      double sal_trab = horas * 10;
      double sal_fam = depends * 60;
      double soma_sal = sal_trab + sal_fam; // valor bruto
      
      double inss = (8.5 * sal_trab) / 100;
      double imp_renda = (5 * sal_trab) / 100;
      double desc = soma_sal - inss - imp_renda; // valor líquido
      
      System.out.println("O funcionário "+ nome +" recebeu de salário bruto R$"+ soma_sal +" e um salário líquido de R$" + desc); 

      valor.close();
  }
}
