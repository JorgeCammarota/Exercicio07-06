import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int N = 0;
        int soma = 0;

        Scanner entrada = new Scanner(System.in);
        for (int i = 1; N >= 0; i++) {
            System.out.println("Digite o " + i + "º valor:");
            N = entrada.nextInt();

            if (N > 0) {
                soma = soma + N;
            }
            System.out.println("A soma do valor digitados é: " + soma);
        }
    }
}
