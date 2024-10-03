import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int[] audienciaCanais = new int[5]; // Canais 2, 4, 5, 7, 12
        int totalPessoas = 0;

        while (true) {
           
            System.out.print("Informe o número do canal (2, 4, 5, 7, 12 ou 0 para encerrar): ");
            int canal = input.nextInt();

            if (canal == 0) {
                break; // Encerra o loop se o canal for zero
            }

            // Verifica se o canal informado é válido
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                
                System.out.print("Informe o número de pessoas assistindo ao canal: ");
                int pessoas = input.nextInt();

                // Soma o número de pessoas ao canal correspondente
                switch (canal) {
                    case 2: audienciaCanais[0] += pessoas; break;
                    case 4: audienciaCanais[1] += pessoas; break;
                    case 5: audienciaCanais[2] += pessoas; break;
                    case 7: audienciaCanais[3] += pessoas; break;
                    case 12: audienciaCanais[4] += pessoas; break;
                }

                // Soma o total de pessoas
                totalPessoas += pessoas;
            } else {
                System.out.println("Canal inválido. Por favor, informe um dos canais disponíveis.");
            }
        }

      
        if (totalPessoas > 0) {
            System.out.println("Percentual de audiência por canal:");
            System.out.printf("Canal 2: %.2f%%\n", (audienciaCanais[0] * 100.0) / totalPessoas);
            System.out.printf("Canal 4: %.2f%%\n", (audienciaCanais[1] * 100.0) / totalPessoas);
            System.out.printf("Canal 5: %.2f%%\n", (audienciaCanais[2] * 100.0) / totalPessoas);
            System.out.printf("Canal 7: %.2f%%\n", (audienciaCanais[3] * 100.0) / totalPessoas);
            System.out.printf("Canal 12: %.2f%%\n", (audienciaCanais[4] * 100.0) / totalPessoas);
        } else {
            System.out.println("Nenhuma pessoa foi registrada assistindo a qualquer canal.");
        }

        input.close();
    }
}
    

