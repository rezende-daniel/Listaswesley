import java.util.Arrays; 
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        //Criar um scanner para receber as sequências
        Scanner scanner = new Scanner(System.in);

        //Introdução
        System.out.println("Você gostaria de saber a união das duas sequências que você possui?");
        System.out.println();

        // Primeira sequência
        System.out.println("Digite quantos elementos terá a primeira sequência:");
        int elementosA = scanner.nextInt();
        int[] sequenciaA = new int[elementosA];
        System.out.println("Digite os elementos da primeira sequência:");
        for (int i = 0; i < elementosA; i++) {  // Usar o valor de elementosA
            System.out.print("Elemento " + (i + 1) + ": ");
            sequenciaA[i] = scanner.nextInt();
        }

        // Segunda sequência
        System.out.println("Digite quantos elementos terá a segunda sequência:");
        int elementosB = scanner.nextInt();
        int[] sequenciaB = new int[elementosB];
        System.out.println("Digite os elementos da segunda sequência:");
        for (int i = 0; i < elementosB; i++) {  // Usar o valor de elementosB
            System.out.print("Número " + (i + 1) + ": ");
            sequenciaB[i] = scanner.nextInt();
        }

        // Exibir as sequências
        System.out.println("Sequência A: " + Arrays.toString(sequenciaA));
        System.out.println();
        System.out.println("Sequência B: " + Arrays.toString(sequenciaB));
        System.out.println();

        // Criar os conjuntos A e B sem elementos repetidos
        int[] conjuntoA = removerRepetidos(sequenciaA);
        int[] conjuntoB = removerRepetidos(sequenciaB);

        // Exibir os conjuntos A e B
        System.out.println("Conjunto A (sem repetição): " + Arrays.toString(conjuntoA));
        System.out.println();
        System.out.println("Conjunto B (sem repetição): " + Arrays.toString(conjuntoB));
        System.out.println();

        // Criar o conjunto C como a união de A e B
        int[] conjuntoC = unirConjuntos(conjuntoA, conjuntoB);

        // Exibir o conjunto C (A união B)
        System.out.println("Conjunto C (união de A e B): " + Arrays.toString(conjuntoC));
        System.out.println();

        scanner.close();
    }

    // Remover elementos repetidos de um vetor usando pesquisa binária
    public static int[] removerRepetidos(int[] sequencia) {

        // Ordenar a sequência para usar a pesquisa binária
        Arrays.sort(sequencia);

        // Vetor temporário para armazenar os elementos únicos
        int[] temporario = new int[sequencia.length];
        int tamanhoAtual = 0;

        // Adicionar o primeiro elemento (que não tem como ser repetido)
        temporario[tamanhoAtual++] = sequencia[0];

        // Verificar os outros elementos
        for (int i = 1; i < sequencia.length; i++) {

            // Se o elemento não está no temporário (usando busca binária), adicioná-lo
            if (buscaBinaria(temporario, sequencia[i], tamanhoAtual) == -1) {
                temporario[tamanhoAtual++] = sequencia[i];
            }
        }

        // Retornar um novo vetor com o tamanho exato dos elementos únicos
        return Arrays.copyOf(temporario, tamanhoAtual);
    }

    // Buscar um elemento em um vetor ordenado usando pesquisa binária
    public static int buscaBinaria(int[] vetor, int valor, int tamanho) {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            // Valor encontrado
            if (vetor[meio] == valor) {
                return meio; 
            }

            // Buscar na metade direita
            if (vetor[meio] < valor) {
                inicio = meio + 1; 

            // Buscar na metade esquerda
            } else {
                fim = meio - 1; 
            }
        }
        // Valor não encontrado
        return -1; 
    }

    // Unir dois conjuntos sem repetição
    public static int[] unirConjuntos(int[] conjuntoA, int[] conjuntoB) {
        
        // Vetor temporário para armazenar a união
        int[] temporario = new int[conjuntoA.length + conjuntoB.length];
        int tamanhoAtual = 0;

        // Adicionar todos os elementos de A
        for (int valor : conjuntoA) {
            temporario[tamanhoAtual++] = valor;
        }

        // Adicionar os elementos de B que não estão em A
        for (int valor : conjuntoB) {
            if (buscaBinaria(temporario, valor, tamanhoAtual) == -1) {
                temporario[tamanhoAtual++] = valor;
            }
        }

        // Retornar um novo vetor com o tamanho exato dos elementos da união
        return Arrays.copyOf(temporario, tamanhoAtual);
    }
}
