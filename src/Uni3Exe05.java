import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("valor pro chip> R$ 4,00 // valor por alimento> R$ 3,50");
        System.out.println("Escolha a quantidade de frangos> ");
        int frangos = valor.nextInt();
        int inflacao = 11 * frangos;
        System.out.println("O valor total foi de "+inflacao); 
        valor.close();
    }
}
