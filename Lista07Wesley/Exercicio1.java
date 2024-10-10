import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Matriz de Entrada:");
        printMatriz(matriz);

        System.out.println("Elementos nas posicoees em que o indice da linha eh par e o indice da coluna eh impar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

        int[][] transposta = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transposta:");
        printMatriz(transposta);

        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }
        System.out.println("Matriz apos trocar diagonais:");
        printMatriz(matriz);
    }

    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}