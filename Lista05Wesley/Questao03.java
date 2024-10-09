import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número natural: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Por favor, insira um número natural.");
        } else {
            long fatorial = 1; // Usamos long para evitar overflow em números grandes

            for (int i = 1; i <= numero; i++) {
                fatorial *= i; // fatorial = fatorial * i
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
