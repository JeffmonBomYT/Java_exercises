import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        System.out.println("Calculadora de dimensão de terreno");
        Scanner tec = new Scanner(System.in);
        System.out.println("Comprimento> ");
        double num = tec.nextInt();
        System.out.println("Largura> ");
        double num2 = tec.nextInt(); 
        double area = num /* * */+ num2;
        System.out.println("Área> "+ area);
        tec.close();
    }
}
