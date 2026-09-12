package ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        String x;
        System.out.println("Digite seu nome: ");
        x = input.next();
        System.out.printf("Seu Nome é %s %n", x);
        
        
        input.close();
        
    }
}