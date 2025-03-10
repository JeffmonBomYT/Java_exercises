
import java.util.Scanner;

public class Uni3Exe14 {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      
      System.out.println("Distância (quilômetros)> ");
      int distancia = valor.nextInt();
      System.out.println("Tempo (horas)> ");
      int tempo = valor.nextInt();
      
      double velo_media = distancia / tempo;
      double fuel = distancia / 12;

      System.out.println("A velocidade média da viajem foi de "+ velo_media +"km/h"+ " e o gasto de combustível foi de " + fuel + "litros");
      valor.close();
  }
}
