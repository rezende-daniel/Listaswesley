import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira os elementos da primeira matriz:");
        int[][] matrix1 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = ler.nextInt();
            }
        }

        System.out.println("Insira os elementos da segunda matriz:");
        int[][] matrix2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = ler.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("A matriz resultante eh:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}