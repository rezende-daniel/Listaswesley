import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira os elementos da matriz 1:");
        int[][] matriz1 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = ler.nextInt();
            }
        }

        System.out.println("Insira os elementos da matriz 2:");
        int[][] matriz2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = ler.nextInt();
            }
        }

        int[][] resultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}