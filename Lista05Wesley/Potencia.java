import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (base): ");
        int base = scanner.nextInt();
        System.out.print("Digite o segundo número (expoente): ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        if (expoente < 0) {
            System.out.println("O expoente deve ser um número inteiro não negativo.");
        } else {
            for (int i = 0; i < expoente; i++) {
                resultado *= base; // Multiplica a base
            }

            System.out.println(base + " elevado a " + expoente + " é: " + resultado);
        }

        scanner.close();
    }
}
