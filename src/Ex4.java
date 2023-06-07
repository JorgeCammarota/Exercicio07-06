import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int i = 1;

        while ( i <= 20){
            System.out.println("Digite a " + i + "ª idade: ");
            double numero = entrada.nextDouble();
            soma += numero;
            i++;
        }

        double media = (double) soma / 20;

        System.out.println("A média da idade digitada é: " + media + " anos ");
    }
}
