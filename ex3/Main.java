package ex3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos minutos ?: ");
        var input = new Scanner(System.in);

        var minutos = input.nextInt();
        
        input.close();
        double pago = 50;
        if (minutos > 100) {
            var diferenca = (minutos - 100);
            pago = pago + (diferenca * 2);
                System.out.println("Valor Pago Será: " + pago + " por você ter consumido: " + diferenca + " minutos A mais !");
        }
        else {
            pago = 50.00;
            System.out.println("Valor Pago Será: " + pago + " por você ter respeitado o limite !");
        }

        }
    }