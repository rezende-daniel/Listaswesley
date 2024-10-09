import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        //Criar um scanner para receber 10 números
        Scanner scanner = new Scanner(System.in);

        //introdução
        System.out.println("Você gostaria de pesquisar um número dentre os dez que possui?");
        System.out.println();

        // Criar um vetor de 10 posições
        int[] numeros = new int[10];

        // Ler os 10 números do teclado e garantir que eles estejam ordenados
        System.out.println("Digite-os em ordem crescente");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verifica se o número atual é menor que o anterior
            if (i > 0 && numeros[i] < numeros[i - 1]) {

                // Faz o usuário repetir a entrada
                System.out.println("Erro: O número deve ser maior ou igual ao anterior. Tente novamente.");
                i--; 
            }
        }

        // Loop para permitir várias pesquisas
        while (true) {

            // Perguntar qual número o usuário deseja pesquisar
            System.out.println("\nDigite o número que você quer pesquisar (ou S para sair):");

            // Captura a entrada como string
            String entrada = scanner.next();  

            // Se o usuário digitar "S", o programa encerra
            if (entrada.equalsIgnoreCase("S")) {
                break;
            }

            // Converter a entrada para número, se não for "S"
            int numeroPesquisado;
            try {
                numeroPesquisado = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número ou 'S' para sair.");
                continue;
            }

            // Realizar a busca binária
            boolean encontrado = buscaBinaria(numeros, numeroPesquisado);

            // Mostrar o resultado
            if (encontrado) {
                System.out.println("Número encontrado!");
            } else {
                System.out.println("Número não encontrado.");
            }
        }

        // Fechar
        scanner.close();
    }

    // Método para busca binária
    public static boolean buscaBinaria(int[] vetor, int valor) {

        // Contador de comparações
        int comparacoes = 0; 
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            comparacoes++;
            
            // Calcula o meio do vetor
            int meio = (inicio + fim) / 2; 

            // Se o valor estiver no meio
            if (vetor[meio] == valor) {
                System.out.println("Comparações usando a busca binária: " + comparacoes);
                return true;
            }

            // Se o valor for menor, ignore a metade direita
            if (vetor[meio] < valor) {
                inicio = meio + 1;
            }
            // Se o valor for maior, ignore a metade esquerda
            else {
                fim = meio - 1;
            }
        }

        // Se o valor não for encontrado
        System.out.println("Comparações na busca binária: " + comparacoes);
        return false;
    }
}
