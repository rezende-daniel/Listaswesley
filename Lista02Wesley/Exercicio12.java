import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o sexo do cliente (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        
        double mensalidade = 0;

        
        if (sexo == 'M' || sexo == 'm') {
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade <= 18) {
                mensalidade = 75.00;
            } else if (idade <= 30) {
                mensalidade = 90.00;
            } else if (idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade <= 25) {
                mensalidade = 90.00;
            } else if (idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.println("O valor da mensalidade é: R$ " + mensalidade);
    }
}
