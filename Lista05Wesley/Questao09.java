import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Números ímpares de 1 até " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}
