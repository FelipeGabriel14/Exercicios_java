import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double total = 0;
        double numero = -1;
        System.out.println("Digite numeros: ");
        while (numero != 0) {
            numero = input.nextInt();
            total += numero;
        }
        System.out.println("A soma dos numeros é: " + total);
        input.close();
    }
}