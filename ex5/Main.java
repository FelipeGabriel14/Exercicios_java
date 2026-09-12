import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Digite a quantidade de vezes, que deseja executar o programa: ");
        int quantidade = input.nextInt();
        int soma = 0;
        System.out.println("Digite Numeros: ");
        for (var i=0; i<quantidade; i++) {
            var numero = input.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma é: " + soma);
        input.close();
    }
    
}
