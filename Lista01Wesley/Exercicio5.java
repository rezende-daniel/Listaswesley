import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double  diagonalMaior;
        double diagonalMenor;
        

        System.out.println("Insira a diagonal maior: ");
        diagonalMaior = teclado.nextDouble();
        System.out.println("Insira a diagonal menor ");
        diagonalMenor= teclado.nextDouble();
        

        double area= (diagonalMaior*diagonalMenor)/2;
        System.out.println("O losango possue "+area+" U.A.");



    }
}