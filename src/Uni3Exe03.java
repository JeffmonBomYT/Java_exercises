import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner pag = new Scanner(System.in);
        System.out.println("Sistema de abastecimento");
        System.out.println("Preço da gasolina: R$ 6,37");
        System.out.println("Valor a pagar> ");
        double paga = pag.nextInt();
        double litros = paga / 6.37;
        System.out.println("O tanque foi abastecido em:"+ litros);
        pag.close();
    }
}
