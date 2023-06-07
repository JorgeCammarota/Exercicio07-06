import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        int N = 0;
        int contador = 1;
        System.out.println("Qual o seu nome? : ");
        String nome = entrada.next();

        System.out.println("Quantas * você deseja ver seu nome? : ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(nome);
        }
    }
}
