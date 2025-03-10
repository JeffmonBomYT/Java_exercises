
import java.util.Scanner;

public class Uni3Exe09 {
  public static void main(String[] args) {
    Scanner valor = new Scanner(System.in);
    System.out.println("Calculadora de volume de latas de óleo");
    System.out.println("Raio> ");
    double raio = valor.nextDouble();
    System.out.println("Altura> ");
    double altura = valor.nextDouble();
    double volume = /*Math.PI -> */3.14 * (/*Math.pow(raio, 2)*/raio * raio) * altura;
    System.out.println("Volume total> "+ volume);
    valor.close();
  }
}
