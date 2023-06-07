import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        if (primeiroNumero  == numero2) {
            int resultado1 = primeiroNumero  + numero2;
            System.out.println("O resultado foi: " + resultado1);
        } else if (primeiroNumero  != numero2) {
            int resultado2 = primeiroNumero  * numero2;
            System.out.println("O resultado foi: " + resultado2);
        }
    }
}
