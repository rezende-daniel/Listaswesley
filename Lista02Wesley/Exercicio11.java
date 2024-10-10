import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o número de diárias: ");
        int numDiarias = scanner.nextInt();

        
        int precoDiaria = 500;

        double taxaServico;
        if (numDiarias < 15) {
            taxaServico = 15.00;
        } else if (numDiarias == 15) {
            taxaServico = 10.00;
        } else {
            taxaServico = 5.00;
        }

        
        double total = numDiarias * (precoDiaria + taxaServico);

        System.out.println("O total a ser pago é: R$ " + total);
    }
}

