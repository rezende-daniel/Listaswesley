import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro positivo: ");
        int num2 = scanner.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Por favor, insira números inteiros positivos.");
        } else {
            int menor = Math.min(num1, num2);
            int maior = Math.max(num1, num2);

            System.out.println("Números entre " + menor + " e " + maior + ":");
            for (int i = menor + 1; i < maior; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        scanner.close();
    }
}
