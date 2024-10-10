import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o tipo de apartamento (Simples ou Duplo): ");
        String tipoApto = scanner.nextLine();
        System.out.print("Digite o número de diárias: ");
        int numDiarias = scanner.nextInt();

       
        double valorDiaria = 0;

        if (tipoApto.equalsIgnoreCase("Simples")) {
            if (numDiarias < 10) {
                valorDiaria = 100.00;
            } else if (numDiarias <= 15) {
                valorDiaria = 90.00;
            } else {
                valorDiaria = 80.00;
            }
        } else if (tipoApto.equalsIgnoreCase("Duplo")) {
            if (numDiarias < 10) {
                valorDiaria = 140.00;
            } else if (numDiarias <= 15) {
                valorDiaria = 120.00;
            } else {
                valorDiaria = 100.00;
            }
        } else {
            System.out.println("Tipo de apartamento inválido.");
            return;
        }

      
        double total = numDiarias * valorDiaria;


        System.out.println("O total a ser pago é: R$ " + total);
    }
}

