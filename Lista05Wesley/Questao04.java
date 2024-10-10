import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int contador = 0;
        int idade;

        System.out.println("Digite as idades (digite um número negativo para finalizar):");

        while (true) {
            idade = scanner.nextInt();

            if (idade < 0) {
                break; 
            }

            somaIdades += idade; 
            contador++; 
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades informadas é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }

        scanner.close();
    }
}
