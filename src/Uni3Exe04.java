import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args){
        Scanner notas = new Scanner(System.in); 
        System.out.println("Nota 1> ");
        double nota1 = notas.nextInt();
        System.out.println("Nota 2> ");
        double nota2 = notas.nextInt();
        System.out.println("Nota 3> ");
        double nota3 = notas.nextInt();
        double nota1_1 = nota1 * 5;
        double nota2_2 = nota2 * 3;
        double nota3_3 = nota3 * 2;
        double somas = nota1_1 + nota2_2 + nota3_3;
        double div = somas / 10;
        System.out.println("A média ponderada foi: "+ div);
        notas.close();
    }

}
