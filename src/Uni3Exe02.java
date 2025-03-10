import java.util.Scanner;


public class Uni3Exe02 {
    public static void main(String[] args){
        System.out.println("Aniversário de 12 anos. 12% de desconto nos calçados");
        Scanner valor = new Scanner(System.in);
        System.out.println("Valor a pagar: ");
        double pagamento = valor.nextDouble();
        System.out.println("Aplicando desconto de 12%...");
        double desconto = (pagamento * 12) / 100;
        //xxx System.out.println("O valor passa a ser: "+ desconto);
        //double pag_real = (pagamento - desconto);
        //System.out.println("O valor passa a ser: "+ pag_real);
        valor.close();
    }
    // // = correção
    // xxx = erro
    
}
