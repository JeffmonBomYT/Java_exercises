import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        System.out.println("Buffet - R$ 25,00 por quilo");
        Scanner peso = new Scanner(System.in);
        double peso_comida = peso.nextDouble();
        double prato_comida = peso_comida - 0.75;
        double preço = prato_comida * 25;
        System.out.println("O valor do prato é de> "+ preço);
        peso.close();
    }
}
