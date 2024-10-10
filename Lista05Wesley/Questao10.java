import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorFemininos = 0;
        int quantidade = 10;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Pessoa " + i + " - Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Pessoa " + i + " - Digite o sexo (F para feminino, M para masculino): ");
            char sexo = scanner.next().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                if (idade >= 20 && idade <= 40) {
                    contadorFemininos++; 
            }
        }

        System.out.println("Número de mulheres entre 20 e 40 anos: " + contadorFemininos);

        scanner.close();
    }
}
