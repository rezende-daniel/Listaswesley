
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis para armazenar as somas e contagens
        double somaSalarios = 0;
        int somaFilhos = 0;
        int totalHabitantes = 0;

        while (true) {
            // Solicita o salário do habitante
            System.out.print("Informe o salário do habitante (valor negativo para encerrar): ");
            double salario = input.nextDouble();

            if (salario < 0) {
                break; // Encerra o loop se o salário for negativo
            }

            // Solicita o número de filhos do habitante
            System.out.print("Informe o número de filhos do habitante: ");
            int filhos = input.nextInt();

            // Atualiza as somas e o total de habitantes
            somaSalarios += salario;
            somaFilhos += filhos;
            totalHabitantes++;
        }

        // Calcula e exibe a média salarial e a média de número de filhos
        if (totalHabitantes > 0) {
            double mediaSalarial = somaSalarios / totalHabitantes;
            double mediaFilhos = (double) somaFilhos / totalHabitantes;

            System.out.printf("Média salarial da população: R$ %.2f\n", mediaSalarial);
            System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi registrado.");
        }

        input.close();
    }
}