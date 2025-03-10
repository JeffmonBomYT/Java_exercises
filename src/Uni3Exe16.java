import java.util.Scanner;

public class Uni3Exe16 {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      System.out.println("Caixa de supermecado (NÃO USAMOS CENTAVOS!!)");
      System.out.println("Valor da compra> ");
      int compra = valor.nextInt();
      System.out.println("Dinheiro entregue> ");
      int pagamento = valor.nextInt();
      int troco = pagamento - compra;

      int notas100 = troco / 100;
      troco = troco % 100;
        
      int notas10 = troco / 10;
      troco = troco % 10;
        
      int notas1 = troco / 1;
      troco = troco % 1;
      System.out.println("Valor do troco a pagar> "+troco);
      System.out.println("O número mínimo de notas de troco> " + (notas100 + notas10 + notas1));
      System.out.println("Quantidade de notas de 100 necessárias> " + notas100);
      System.out.println("Quantidade de notas de 10 necessárias> " + notas10);
      System.out.println("Quantidade de notas de 1 necessárias> " + notas1);
      
      valor.close();
  }
}


//Auxiliado por terceiros (IA)
