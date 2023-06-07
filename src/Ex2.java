import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("numero par somar  +5 e seja ÍMPAR irá somar +8");
        System.out.println("Digite um número: " );
        int numero = entrada.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O resultado da soma  é: " + (numero + 5));;
        } else {
            System.out.println("O resultado da  é: " + (numero + 8));
        }
    }
}
