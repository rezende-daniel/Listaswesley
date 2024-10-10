import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaIdades = 0;
        int quantidade = 10;
        int idade;

        System.out.println("Digite a idade de " + quantidade + " pessoas:");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / quantidade;
        System.out.println("A média das idades informadas é: " + media);

        scanner.close();
    }
}

