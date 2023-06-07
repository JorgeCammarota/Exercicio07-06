import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        {   int numero = 0;
            int cont100 = 0;

            Scanner entrada = new Scanner(System.in);

            for (int i = 1; i <= 20; i++) {

                System.out.println("Digite o " + i + "º valor: ");

                numero = entrada.nextInt();

                if ((numero <= 100) && (numero >= 0)) {

                    cont100 = cont100 + 1;

                }

            }

            System.out.println(cont100 + " número está entre o número 0 e 100.");

        }
    }
}
