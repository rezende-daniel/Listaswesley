import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Criar um scanner para receber 10 números
        Scanner scanner = new Scanner(System.in);

        //introdução
        System.out.println("Você gostaria de procurar um número dentre os 10 que possui e saber quantas comparações foram feitas usando um dos métodos (sequencial ou sequencial com sentinela)?");
        System.out.println();

        // Criar um vetor de 10 posições
        int[] numeros = new int[10];

        // Ler os 10 números digitados
        System.out.println("Digite 10 números");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Loop principal para permitir várias pesquisas
        while (true) {
            // Perguntar qual número o usuário deseja pesquisar
            System.out.println("\nDigite o número que você quer pesquisar (ou S para sair):");
            String entrada = scanner.next();  // Captura a entrada como string

            // Se o usuário digitar "S", o programa encerra
            if (entrada.equalsIgnoreCase("S")) {
                break;
            }

            // Converter a entrada para número, se não for "S"
            int numeroPesq;
            try {
                numeroPesq = Integer.parseInt(entrada);  // Tenta converter para número
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número ou 'S' para sair.");
                continue;
            }

            // Escolher o algoritmo de busca
            System.out.println("Escolha o tipo de busca:\n1 - Sequencial\n2 - Sequencial com Sentinela");
            int escolha = scanner.nextInt();

            // Variável para contar as comparações
            boolean encontrado = false;

            // Realizar a busca escolhida
            if (escolha == 1) {
                // Busca Sequencial
                encontrado = buscaSeq(numeros, numeroPesq);
            } else if (escolha == 2) {
                // Busca Sequencial com Sentinela
                encontrado = buscaSeqCS(numeros, numeroPesq);
            } else {
                System.out.println("Escolha inválida!");
                continue;
            }

            // Exibição
            if (encontrado) {
                System.out.println("Número encontrado!");
            } else {
                System.out.println("Número não encontrado.");
            }
        }

        // Fechar
        scanner.close();
    }

    // Busca sequencial
    public static boolean buscaSeq(int[] vetor, int valor) {
        // Contar as comparações
        int comparacoes = 0; 
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == valor) {
                // Caso encontre
                System.out.println("Comparações na busca sequencial: " + comparacoes);
                return true;
            }
        }
        // Caso não encontre
        System.out.println("Comparações na busca sequencial: " + comparacoes);
        return false;
    }

    // Método de busca sequencial com sentinela
    public static boolean buscaSeqCS(int[] vetor, int valor) {
        // Contar as comparações
        int comparacoes = 0;
        int[] vetorCS = new int[vetor.length + 1];

        // Copiar o vetor original para o vetor com sentinela
        System.arraycopy(vetor, 0, vetorCS, 0, vetor.length);

        // Adicionar a sentinela
        vetorCS[vetor.length] = valor;  // A sentinela recebe o valor pesquisado

        int i = 0;

        // Loop até encontrar o valor no vetor ou a sentinela
        while (vetorCS[i] != valor) {
            comparacoes++;
            i++;
        }

        // A última comparação para verificar o valor na sentinela
        comparacoes++;

        // Exibe o número de comparações
        System.out.println("Comparações na busca sequencial com sentinela: " + comparacoes);

        // Retorna verdadeiro se o número foi encontrado antes da sentinela
        return i < vetor.length;
    }
}
