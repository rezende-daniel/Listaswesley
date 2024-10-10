import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer maior = null;
        Integer menor = null;
        int numero;

        System.out.println("Digite os números inteiros (digite -1 para finalizar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            if (maior == null || menor == null) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        if (maior != null && menor != null) {
            System.out.println("O maior número informado é: " + maior);
            System.out.println("O menor número informado é: " + menor);
        } else {
            System.out.println("Nenhum número válido foi informado.");
        }

        scanner.close();
    }
}
